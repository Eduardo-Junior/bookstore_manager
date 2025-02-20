package com.eduardoandre.booksstoremanager.service;

import com.eduardoandre.booksstoremanager.dto.BookDTO;
import com.eduardoandre.booksstoremanager.dto.MessageResponseDTO;
import com.eduardoandre.booksstoremanager.entities.Book;
import com.eduardoandre.booksstoremanager.mapper.BookMapper;
import com.eduardoandre.booksstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){
        Book book = bookMapper.toModel(bookDTO) ;

        Book savedBook = bookRepository.save(book);

        return MessageResponseDTO.builder().message("Book created with ID" + savedBook.getId_b()).build();
    }
}
