package com.eduardoandre.booksstoremanager.utils;

import com.eduardoandre.booksstoremanager.dto.AuthorDTO;
import com.eduardoandre.booksstoremanager.entities.Author;
import com.github.javafaker.Faker;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class AuthorUtils {
    private static final Faker faker = Faker.instance();

    public static AuthorDTO createFakeAuthorDTO() {
        return AuthorDTO.builder()
                .id((int)faker.number().randomNumber())
                .name(faker.book().author())
                .age(faker.number().numberBetween(0, 100))
                .build();
    }

    public static Author createFakeAuthor() {
        return Author.builder()
                .id((int)faker.number().randomNumber())
                .name(faker.book().author())
                .age(faker.number().numberBetween(0, 100))
                .build();
    }

    public static Author createFakeAuthorFrom(AuthorDTO authorDTO) {
        return Author.builder()
                .id(authorDTO.getId())
                .name(authorDTO.getName())
                .age(authorDTO.getAge())
                .build();
    }

}
