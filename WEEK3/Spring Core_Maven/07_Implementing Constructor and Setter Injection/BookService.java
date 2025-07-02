package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String serviceName;
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("[DI] BookService: Constructed with serviceName = " + serviceName);
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performOperation() {
        System.out.println("[DI] BookService (" + serviceName + "): Performing operation...");
        bookRepository.saveBook();
    }
}
