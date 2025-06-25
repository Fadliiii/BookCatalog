package com.ucom.book_catalog.dto.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ucom.book_catalog.util.LocalDateI18N;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author fadli a.k.a. FadliLlatul Umam
Java Developer
Created on 25/06/2025 21:21
@Last Modified 25/06/2025 21:21
Version 1.0
*/
@Data
public class AuthorResponseDto {
    private Integer id;

    private String name;

    private String bookTitle;

    @JsonSerialize(using = LocalDateI18N.class)
    private LocalDate birthDate;
}
