package com.jezielmonteiro.books.repository;

import com.jezielmonteiro.books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}