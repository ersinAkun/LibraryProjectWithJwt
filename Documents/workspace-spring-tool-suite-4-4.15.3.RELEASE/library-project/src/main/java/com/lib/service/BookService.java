package com.lib.service;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.controller.dto.AddBookRequestDTO;
import com.lib.controller.dto.ListBooksForUsersDTO;
import com.lib.domain.Book;
import com.lib.exception.ResourceNotFoundException;
import com.lib.repository.BookRepository;
import com.lib.repository.UserRepository;

@Service
public class BookService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	UserService userService;
	
	
	//LoginRequest loginRequest = new LoginRequest();  //dto dan bean olusur mu?
	
	
	
	public void addBook(@Valid AddBookRequestDTO request) {
		
		Book book = new Book();

		        book.setBookName(request.getBookName());
		        book.setAuthorName(request.getAuthorName());
		        book.setCategory(request.getCategory());
		        book.setStatus(request.getStatus());
		        book.setDate(request.getDate());
		        book.setOwner(request.getOwner());

		        bookRepository.save(book);
		
	}


	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}


	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}
	
	public void updateBook(Long id, AddBookRequestDTO request) {

        boolean exist = bookRepository.existsById(id);
        	
        Book book = findBook(id);
       
        	if (exist) {

            book.setBookName(request.getBookName());
            book.setAuthorName(request.getAuthorName());
            book.setCategory(request.getCategory());
            book.setStatus(request.getStatus());
            book.setDate(request.getDate());
            book.setOwner(request.getOwner());

            bookRepository.save(book);
        }
        else {
            throw new ResourceNotFoundException("Could not found id: "+id);
        }
	    
	}


	private Book findBook(Long id ) {
		return bookRepository.findById(id).
				orElseThrow(()->new ResourceNotFoundException("Book not found with id : "+id));
	}

  
	
	//*****  kulanici kitap alma methodu  *****
	
	public void getBook(Long id, String mail) {
		int count = 0;
		for(Book w: bookRepository.findAllByOwner(mail)) {
			count++;
		}
		
		Book book = findBook(id);
		if(book.getStatus()==true && count<3) {
			book.setOwner(mail);
			book.setStatus(false);
			book.setDate(LocalDate.now().toString());
			bookRepository.save(book);
		}else {
			throw new ResourceNotFoundException("Could not found available book with that id : "+id);
		}
	}

	//*****  kulanici kitap iade methodu  *****
	public void returnBook(Long id, String mail) {
		
		Book book = findBook(id);
		book.setOwner("");
		book.setStatus(true);
		book.setDate("");
		bookRepository.save(book);
		
	}


	public List<Book> getMyBooks(String mail) {
		
		List<Book> myBooks = bookRepository.findAllByOwner(mail);
		
		return myBooks;
	}
	
	
	public List<Book> getAvailableBooks(Boolean status) {

        return bookRepository.bringAvailableBooks(status);
    }


	public List<ListBooksForUsersDTO> getBookForUser() {
		return bookRepository.findAllBook();
		
	//	List<ListBooksForUsersDTO> forUserBook = new ArrayList<>();
	//	List<Object>returnList = bookRepository.BooksForUser();
	//	for(Object w : returnList) {
	//		forUserBook.add((ListBooksForUsersDTO) w);
	//	}
	}	
		
	

/*
	public List<Book> getAvailableBooks(Boolean isAvailable) {
		
		return bookRepository.getAvailableBooks(isAvailable);
	}
*/

	


	
	
	
	
	
	

}


