package com.eduardoandre.booksstoremanager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_b;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private int pages;

    @Column(nullable = false)
    private int isbn;

    @Column(name = "publisher_name", nullable = false, unique = true)
    private String publisherName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}


