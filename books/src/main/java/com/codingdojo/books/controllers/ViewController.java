package com.codingdojo.books.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.books.models.Book;
import com.codingdojo.books.services.BookService;

@Controller
public class ViewController {

	
	private final BookService bookService;
	
	
	public ViewController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
	   List<Book> allBooks = bookService.allBooks();
	   
		model.addAttribute("books", allBooks);
		
		return "index.jsp";
	}
	
	
}
