package com.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.Entity.Borrowing_and_Returning_Books;

public interface Borrowing_and_Returning_BooksRepo extends JpaRepository<Borrowing_and_Returning_Books, Integer>{

}
