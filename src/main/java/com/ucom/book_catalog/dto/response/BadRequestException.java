package com.ucom.book_catalog.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author fadli a.k.a. FadliLlatul Umam
Java Developer
Created on 26/06/2025 1:36
@Last Modified 26/06/2025 1:36
Version 1.0
*/
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{

        private static final long serialVersionUID = 1L;

    public BadRequestException(String message) {
        super(message);
    }
}
