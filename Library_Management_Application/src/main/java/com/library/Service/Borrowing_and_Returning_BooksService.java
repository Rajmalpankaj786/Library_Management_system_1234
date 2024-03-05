package com.library.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Repository.Borrowing_and_Returning_BooksRepo;

@Service
public class Borrowing_and_Returning_BooksService {

	@Autowired
	private Borrowing_and_Returning_BooksRepo repo;
	
	
}
