package com.eduardoandre.booksstoremanager.dto;

import com.eduardoandre.booksstoremanager.entities.Author;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotNull
    private int pages;

    @NotNull
    private int isbn;

    @NotBlank
    @Size(max = 300)
    private String publisherName;

    @NotNull
    @Valid
    private Author author;
}
