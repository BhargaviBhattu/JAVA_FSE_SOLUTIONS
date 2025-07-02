package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
        System.out.println("[XML] BookService: initialized");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void process() {
        System.out.println("[XML] BookService: processing book...");
        bookRepository.saveBook();
    }
}
