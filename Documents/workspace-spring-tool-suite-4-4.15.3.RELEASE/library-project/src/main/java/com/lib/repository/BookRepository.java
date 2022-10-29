package com.lib.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lib.controller.dto.ListBooksForUsersDTO;
import com.lib.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	List<Book> findAllByOwner(String mail);

	
	
	//@Query(value="SELECT * FROM tbl_book b WHERE b.status=:pstatus", nativeQuery=true)
    //List<Book> getAvailableBooks(@Param ("pstatus")Boolean isAvailable );

	@Query("SELECT b FROM Book b WHERE b.status=:isAvailable")
    List<Book> bringAvailableBooks(@Param("isAvailable")Boolean status);
	
	
	/*
	@Query("SELECT bookName,authorName,category,status FROM Book ")	
	List<Object> BooksForUser();
	//TODO 
	*/
	  // @Query("SELECT new com.lecture.carrental.dto.CarDTO(c) FROM Car c")
	  //     List<CarDTO> findAllCar();
	
	@Query("SELECT new com.lib.controller.dto.ListBooksForUsersDTO(b) FROM Book b")
	List<ListBooksForUsersDTO> findAllBook();

}
