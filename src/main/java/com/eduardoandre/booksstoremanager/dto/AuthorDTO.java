package com.eduardoandre.booksstoremanager.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {

    private int id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotNull
    private int age;
}
