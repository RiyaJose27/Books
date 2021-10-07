package com.codingdojo.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.books.models.Book;
import com.codingdojo.books.services.BookService;

@RestController

public class BookController {
	
	
	
	 private final BookService bookService;
	    public BookController(BookService bookService){
	        this.bookService = bookService;
	    }
	   
	         
	        //Method to see all Books
	    @RequestMapping("/allBooks")
	    public List<Book> index() {
	        return bookService.allBooks();
	    }
	    //Method to create a Book
	    @RequestMapping(value="/newBook", method=RequestMethod.POST)
	    public Book create(@RequestParam(value="title") String title, 
	    		@RequestParam(value="description") String desc, 
	    		@RequestParam(value="language") String lang, 
	    		@RequestParam(value="page") int page) {
	    	
	    	
	        Book book = new Book(title, desc, lang, page);
	        return bookService.createBook(book);
	    }
	    
	    
	    //Method to retrieve one book
	    
	    @RequestMapping("/book/{id}")
	    public Book oneBook(@PathVariable("id") Long id) {
	    	return bookService.oneBook(id);
	    }
	    
	    
	    //Method to update a Movie
	    
	   
	
	        @RequestMapping(value="/updateBook/{id}", method=RequestMethod.PUT)
	        public Book update(
	        		@PathVariable("id") Long id, 
	        		@RequestParam(value="title") String title, 
	        		@RequestParam(value="description") String desc, 
	        		@RequestParam(value="language") String lang,
	        		@RequestParam(value="page") int page) {
	            Book book = bookService.updateBook(id, title, desc, lang, page);
	            return book;
	        }
	        
	        
	        
	        
	        ///method to delete a Book
	        @RequestMapping(value="/destroy/{id}", method=RequestMethod.DELETE)
	        public void destroy(@PathVariable("id") Long id) {
	
	        	bookService.deleteBook(id);
	        }
	    }

	    
	    
	    
	    
	    

	

	

