package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(">>> Starting Spring Application");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(">>> Spring Context Loaded");

        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook();
    }
}
