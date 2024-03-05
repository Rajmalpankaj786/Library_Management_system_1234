package com.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Entity.Book;
import com.library.Exception.NotFoundException;
import com.library.Repository.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public Book addBook(Book book) {

		return bookRepo.save(book);
	}

	public List<Book> viewallBook() {
		return bookRepo.findAll();
	}

	public Book updateBook(Book book) {
	Optional<Book> b2 = bookRepo.findById(book.getId());
	
       if(b2.get() != null) {
    	    
    	    return bookRepo.save(book);
       }else {
    	   throw new NotFoundException("given id does't exists");
       }
    
	}
	
	public Optional<Book> viewById(Integer id) {

		return bookRepo.findById(id);
	}

}
