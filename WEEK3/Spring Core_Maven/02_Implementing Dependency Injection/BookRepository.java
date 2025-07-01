package com.library.repository;

public class BookRepository {
    public BookRepository() {
        System.out.println("[Spring DI] BookRepository initialized.");
    }

    public void save() {
        System.out.println("[Spring DI] BookRepository: saving book to database...");
    }
}
