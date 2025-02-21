package com.eduardoandre.booksstoremanager.utils;

import com.eduardoandre.booksstoremanager.entities.Book;
import com.eduardoandre.booksstoremanager.dto.BookDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.javafaker.Faker;

import static com.eduardoandre.booksstoremanager.utils.AuthorUtils.createFakeAuthor;
import static com.eduardoandre.booksstoremanager.utils.AuthorUtils.createFakeAuthorDTO;
import static com.eduardoandre.booksstoremanager.utils.AuthorUtils.createFakeAuthorFrom;

public class BookUtils {
    private static final Faker faker = Faker.instance();


    public static BookDTO createFakeBookDTO() {
        return BookDTO.builder()
                .name(faker.book().title())
                .pages(faker.number().numberBetween(1, 200))
                .isbn("0-596-52068-9")
                .publisherName(faker.book().publisher())
                .author(createFakeAuthorDTO())
                .build();
    }

    public static Book createFakeBook() {
        return Book.builder()
                .name(faker.name().fullName())
                .pages(faker.number().numberBetween(1, 200))
                .isbn("0-596-52068-9")
                .publisherName(faker.book().publisher())
                .author(createFakeAuthor())
                .build();
    }

    public static Book createFakeBookFrom(BookDTO bookDTO) {
        return Book.builder()
                .id(bookDTO.getId())
                .pages(bookDTO.getPages())
                .name(bookDTO.getName())
                .isbn(bookDTO.getIsbn())
                .publisherName(bookDTO.getPublisherName())
                .author(createFakeAuthorFrom(bookDTO.getAuthor()))
                .build();
    }

    public static String asJsonString(BookDTO bookDTO) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
            objectMapper.registerModule(new JavaTimeModule());

            return objectMapper.writeValueAsString(bookDTO);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
