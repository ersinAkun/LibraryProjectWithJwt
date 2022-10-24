package com.lib.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.controller.dto.AddBookRequestDTO;
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
	
	
	
	
	
	

}

