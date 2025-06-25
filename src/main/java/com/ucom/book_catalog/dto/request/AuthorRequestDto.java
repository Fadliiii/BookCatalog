package com.ucom.book_catalog.dto.request;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ucom.book_catalog.util.LocalDateI18N;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author fadli a.k.a. FadliLlatul Umam
Java Developer
Created on 25/06/2025 21:01
@Last Modified 25/06/2025 21:01
Version 1.0
*/
@Data
public class AuthorRequestDto {
    private String name;

    private String bookTitle;

    @JsonSerialize(using = LocalDateI18N.class)
    private LocalDate birthDate;
}
