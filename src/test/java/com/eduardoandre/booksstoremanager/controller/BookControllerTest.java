package com.eduardoandre.booksstoremanager.controller;

import com.eduardoandre.booksstoremanager.dto.BookDTO;
import com.eduardoandre.booksstoremanager.dto.MessageResponseDTO;
import com.eduardoandre.booksstoremanager.service.BookService;
import com.eduardoandre.booksstoremanager.utils.BookUtils;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.net.URI;

import static com.eduardoandre.booksstoremanager.utils.BookUtils.asJsonString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {
    private static final String BOOK_API_URL_PATH = "/api/V1/books";
    private MockMvc mockMvc;

    @Mock
    private BookService bookService;

    @InjectMocks
    private BookController bookController;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(bookController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((viewName, locale) -> new MappingJackson2JsonView()).build();
    }

    @Test
    void testWhenPostCalledThenABookShouldBeCreated() throws Exception{
        BookDTO fakeBookDTO = BookUtils.createFakeBookDTO();
        MessageResponseDTO expectedMessageResponde = MessageResponseDTO.builder()
                .message("Book created successfully with id " + fakeBookDTO.getId())
                .build();

        Mockito.when(bookService.createBook(fakeBookDTO)).thenReturn(expectedMessageResponde);

        mockMvc.perform(post(BOOK_API_URL_PATH)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(fakeBookDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message", Is.is(expectedMessageResponde.getMessage())));
    }

    @Test
    void testWhenPostWithInvalidISBNThenABadRequestShouldBeReturned() throws Exception{
        BookDTO fakeBookDTO = BookUtils.createFakeBookDTO();
        fakeBookDTO.setIsbn("Invalid isbn");

        mockMvc.perform(post(BOOK_API_URL_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(fakeBookDTO)))
                        .andExpect(status().isBadRequest());
    }
}
