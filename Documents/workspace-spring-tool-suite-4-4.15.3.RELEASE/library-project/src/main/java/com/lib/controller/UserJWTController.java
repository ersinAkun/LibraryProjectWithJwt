package com.lib.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lib.controller.dto.AddBookRequestDTO;
import com.lib.controller.dto.ListBooksForUsersDTO;
import com.lib.controller.dto.LoginRequest;
import com.lib.controller.dto.RegisterRequest;
import com.lib.controller.dto.UpdateRequestDTO;
import com.lib.domain.Book;
import com.lib.domain.User;
import com.lib.security.JwtUtils;
import com.lib.service.BookService;
import com.lib.service.UserService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping
@AllArgsConstructor
@NoArgsConstructor
public class UserJWTController {

	@Autowired
	private UserService userService;
		
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtils jwtUtils;
	
	@Autowired
	BookService bookService;
	
	
	
	//*********   REGISTER   *****************
		@PostMapping("/register")
		public ResponseEntity<Map<String,String>> registerUser (@Valid @RequestBody RegisterRequest request ) {
			userService.registerUser(request);
			
			Map<String,String> map = new HashMap<>();
			map.put("message",	" User registered successfuly");
			map.put("status", "true");
			return new ResponseEntity<>(map,HttpStatus.CREATED);
			
		}
	//*******************************************
	
		// ****************LOGIN********************
		@GetMapping("/login")
		public ResponseEntity<Map<String,String>> login(@Valid @RequestBody com.lib.controller.dto.LoginRequest request){
			//kullanıcı kontrol edilecek
			Authentication  authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(request.getUserMail(), request.getPassword()));
			// JWT token üretilecek
			String token = jwtUtils.generateToken(authentication);
			
			Map<String,String> map = new HashMap<>();
			map.put("token",	token);
			map.put("status", "true");
			return new ResponseEntity<>(map,HttpStatus.ACCEPTED);
			
		}
		
		//******** **  GET ALL USER  *************
		@GetMapping("/listUsers")
	    @PreAuthorize("hasRole('ROLE_ADMIN')")//sadece admin olan kişi getAll yapabilsin
	    public ResponseEntity<List<User>> getAll() {
	        // @RequestBody = gelen parametreyi, requestin bodysindeki bilgisi , 
	           //Student objesine map edilmesini sağlıyor.
	        List<User> users=  userService.getAll();
	        return ResponseEntity.ok(users);
	    }
		
		//********* DELETE USER  ************
		@DeleteMapping("/deleteUser/{id}")
		@PreAuthorize("hasRole('ROLE_ADMIN')")  ////sadece admin olan kişi silebilir
	    public ResponseEntity<Map<String,String>> deleteUser(@PathVariable("id") Long id) {
	        userService.deleteUser(id);
	        Map<String,String> map = new HashMap<>();
	        map.put("message", "User is deleted successfuly");
	        map.put("status", "true");
	        return new ResponseEntity<>(map,HttpStatus.OK);
	     //TODO kullanicinin iade etmesi gereken kitap varsa silemesin   	
	    }
		
		//********  UPDATE  *************
		@PutMapping("/update/{id}")
		@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	    public ResponseEntity<Map<String, String>> updateUser( @PathVariable Long id, @RequestBody UpdateRequestDTO updateRequestDTO){

	        userService.updateUser(id,updateRequestDTO);
	        Map<String,String> map = new HashMap<>();
	        map.put("message", "User is updated successfuly");
	        map.put("status", "true");
	        return new ResponseEntity<>(map,HttpStatus.OK);
	    }
		
		//*********  KITAP EKLEME  **********
		@PostMapping("/addBook")
		@PreAuthorize("hasRole('ROLE_ADMIN')")
		public ResponseEntity<Map<String,String>> addBook (@Valid @RequestBody AddBookRequestDTO request ) {
			bookService.addBook(request);
			Map <String, String>  map = new HashMap<>();
			map.put("message",	" Book added successfuly");
			map.put("status", "true");
			return new ResponseEntity<>(map,HttpStatus.CREATED);
			
		}
		
		
		//*********  KITAP LISTELEME admın ıcın **********
	    @GetMapping("/listBooks")
	    @PreAuthorize("hasRole('ROLE_ADMIN')")
	    public ResponseEntity<List<Book>> getAllBooks() {
	        List<Book> books=  bookService.getAllBooks();
	        return ResponseEntity.ok(books);
	    }
	    
		//********  KITAP SILME  ************
	    @DeleteMapping("/deleteBook/{id}")
		@PreAuthorize("hasRole('ROLE_ADMIN')")  ////sadece admin olan kişi silebilir
	    public ResponseEntity<Map<String,String>> deleteBook(@PathVariable("id") Long id) {
	        bookService.deleteBook(id);
	        Map<String,String> map = new HashMap<>();
	        map.put("message", "Book is deleted successfuly");
	        map.put("status", "true");
	        return new ResponseEntity<>(map,HttpStatus.OK);
	     //TODO kullanicinin iade etmesi gereken kitap varsa silemesin   	
	    }
		
	  //******** KITAP UPDATE  *************
	  		@PutMapping("/updateBook/{id}")
	  		@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	  	    public ResponseEntity<Map<String, String>> updateBook( @PathVariable Long id, @RequestBody AddBookRequestDTO addBookRequestDTO){

	  	        bookService.updateBook(id,addBookRequestDTO);
	  	        Map<String,String> map = new HashMap<>();
	  	        map.put("message", "Book is updated successfuly");
	  	        map.put("status", "true");
	  	        return new ResponseEntity<>(map,HttpStatus.OK);
	  	    }
	    
	    //******  Kullanici Kitap Alacak  **********
	  		@PutMapping("/getBook/{id}")
	  	    @PreAuthorize("hasRole('ROLE_USER')")
	  	    public ResponseEntity<Map<String,String>> getBook(@PathVariable("id") Long id,HttpServletRequest request) {
	  	      
	  			String mail = (String) request.getAttribute("mail");
	  			bookService.getBook(id,mail);
	  	        Map<String,String> map = new HashMap<>();
	  	        map.put("message", "Book is taken successfuly");
	  	        map.put("status", "true");
	  	        
	  	        return new ResponseEntity<>(map,HttpStatus.OK);
	  	    }	
	  		
	  	//******  Kullanici Kitap Iade Edecek   *********	
	  		
	  		@PutMapping("/returnBook/{id}")
	  	    @PreAuthorize("hasRole('ROLE_USER')")
	  	    public ResponseEntity<Map<String,String>> returnBook(@PathVariable("id") Long id,HttpServletRequest request) {
	  	      
	  			String mail = (String) request.getAttribute("mail");
	  			bookService.returnBook(id,mail);
	  	        Map<String,String> map = new HashMap<>();
	  	        map.put("message", "Book is returned successfuly");
	  	        map.put("status", "true");
	  	        return new ResponseEntity<>(map,HttpStatus.OK);
	  	    }	
	  		
	  	//*****  Kullanici aldigi kitaplari Listelesin  *********
	  		@GetMapping("/listMyBooks")
	  		@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	  		public ResponseEntity<List<Book>> getMyBooks(HttpServletRequest request) {
	  			
	  			String mail = (String) request.getAttribute("mail");
		        List<Book> books=  bookService.getMyBooks(mail);
		        return ResponseEntity.ok(books);
	  		}
	  	//*****  Alınabilir Kitaplar Listelensin  *********       
	  /*		@GetMapping("/availableBooks")
	  		@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	  		
	  		 public ResponseEntity<List<Book>> availableBooks(Boolean isAvailable) {
	  			 
	  			isAvailable = true;
		        List<Book> books=  bookService.getAvailableBooks(isAvailable);
		        return ResponseEntity.ok(books);
		    }
	  	*/	
	  		
	  		// *************   BOOK STATUS  *********
	  		@GetMapping("/bookStatus/{isAvailable}")
	  	    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	  	     public ResponseEntity<List<Book>> availableBooks(@PathVariable("isAvailable")Boolean status) {
	  	      List<Book> books=  bookService.getAvailableBooks(status);
	  	      return ResponseEntity.ok(books);
	  	  }
	  		
	 /*     yukaridaki methodda true false yapinca bu methoda gerek kalmiyor
	  	//*****  Alınmis Kitaplar Listelensin  ********* 			
	  		@GetMapping("/takenBooks")
	  		@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	  		
	  		 public ResponseEntity<List<Book>> getNotAvailableBooks(Boolean isAvailable) {
	  			 
	  			isAvailable = false;
		        List<Book> books=  bookService.getAvailableBooks(isAvailable);
		        return ResponseEntity.ok(books);
		    }
	  */		
	  		
	  // **********     		
	  		
	  		
	  	//*********  KITAP LISTELEME user ıcın  **********
		    @GetMapping("/listBooksForUsers")
		    @PreAuthorize("hasRole('ROLE_USER')")
		    public ResponseEntity<List<ListBooksForUsersDTO>> getAllBooksForUser() {
		        List<ListBooksForUsersDTO> books=  bookService.getBookForUser();
		        return ResponseEntity.ok(books);
		    }
	  		



	  		
	  		
	  		
	  		
	  		
}	  		

