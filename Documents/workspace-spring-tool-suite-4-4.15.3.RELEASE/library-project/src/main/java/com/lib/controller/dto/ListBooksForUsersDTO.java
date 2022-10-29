package com.lib.controller.dto;
import com.lib.domain.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ListBooksForUsersDTO {

	private String bookName;
	
	private String authorName;

	private String category;
	//kitap durumu 
	private Boolean status;
	
	
	
	public ListBooksForUsersDTO(Book book) {
		
		this.bookName = book.getBookName();
		this.authorName = book.getAuthorName();
		this.category = book.getCategory();
		this.status = book.getStatus();
	}
	

}
