package com.eduardoandre.booksstoremanager.entity;

import jakarta.persistence.*;

@Entity

//Project loombok methods of replacing Java's default getter, setter and constructors
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private int age;

}
