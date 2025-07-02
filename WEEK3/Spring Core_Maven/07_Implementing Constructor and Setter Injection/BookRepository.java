package com.library.repository;

public class BookRepository {
    public BookRepository() {
        System.out.println("[DI] BookRepository: Initialized");
    }

    public void saveBook() {
        System.out.println("[DI] BookRepository: Saving book...");
    }
}
