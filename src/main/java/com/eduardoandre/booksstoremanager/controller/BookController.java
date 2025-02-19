package com.eduardoandre.booksstoremanager.controller;

import com.eduardoandre.booksstoremanager.dto.MessageResponseDTO;
import com.eduardoandre.booksstoremanager.entity.Book;
import com.eduardoandre.booksstoremanager.repository.BookRepository;
import com.eduardoandre.booksstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/V1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        return bookService.create(book);
    }
}
