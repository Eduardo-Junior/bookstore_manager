package com.eduardoandre.booksstoremanager.mapper;

import com.eduardoandre.booksstoremanager.dto.BookDTO;
import com.eduardoandre.booksstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    Book toModel(BookDTO bookDTO);

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO toDTO(Book book);

}
