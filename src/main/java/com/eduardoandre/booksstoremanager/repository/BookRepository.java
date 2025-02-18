package com.eduardoandre.booksstoremanager.repository;

import com.eduardoandre.booksstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
