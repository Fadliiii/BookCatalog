package com.ucom.book_catalog.model;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author fadli a.k.a. FadliLlatul Umam
Java Developer
Created on 25/06/2025 20:52
@Last Modified 25/06/2025 20:52
Version 1.0
*/

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "author_name")
    private String name;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "birth_date")
    private LocalDate birthDate;
}
