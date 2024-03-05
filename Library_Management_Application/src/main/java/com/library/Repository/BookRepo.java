package com.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.Entity.Book;

public  interface BookRepo extends JpaRepository<Book,Integer> {

	//public Book findByBookId(Integer id);
}
