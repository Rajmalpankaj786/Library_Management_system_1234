package com.library.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.library.Entity.Book;
import com.library.Service.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		return new  ResponseEntity<Book>(bookService.addBook(book), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> viewAllBook(){
		return new ResponseEntity<List<Book>>(bookService.viewallBook(),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Book> updateBook(@RequestBody Book book ){
		return new  ResponseEntity<Book>(bookService.updateBook(book), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Book>> viewById(@PathVariable Integer id){
		return new ResponseEntity<Optional<Book>>(bookService.viewById(id),HttpStatus.OK);
	}
}
