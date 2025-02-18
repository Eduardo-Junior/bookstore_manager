package com.eduardoandre.booksstoremanager.entity;

import jakarta.persistence.*;

@Entity
//Project loombok methods of replacing Java's default getter, setter and constructors
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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
