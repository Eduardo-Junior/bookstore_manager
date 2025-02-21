package com.eduardoandre.booksstoremanager.mapper;

import com.eduardoandre.booksstoremanager.dto.BookDTO;
import com.eduardoandre.booksstoremanager.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
