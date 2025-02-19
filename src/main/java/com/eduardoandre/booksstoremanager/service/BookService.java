package com.eduardoandre.booksstoremanager.service;

import com.eduardoandre.booksstoremanager.dto.MessageResponseDTO;
import com.eduardoandre.booksstoremanager.entity.Book;
import com.eduardoandre.booksstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){
        Book savedBook = bookRepository.save(book);

        return MessageResponseDTO.builder().message("Book created with ID" + savedBook.getId()).build();
    }
}
