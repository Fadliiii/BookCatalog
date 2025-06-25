package com.ucom.book_catalog.controller;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author fadli a.k.a. FadliLlatul Umam
Java Developer
Created on 25/06/2025 21:08
@Last Modified 25/06/2025 21:08
Version 1.0
*/

import com.ucom.book_catalog.dto.request.AuthorRequestDto;
import com.ucom.book_catalog.dto.response.AuthorResponseDto;
import com.ucom.book_catalog.repository.AuthorRepository;
import com.ucom.book_catalog.sevice.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;

    @PostMapping
    public AuthorResponseDto createNewAuthor(@RequestBody AuthorRequestDto dto){
        return authorService.createNewAuthor(dto);
    }

    @GetMapping
    public List<AuthorResponseDto> findAll(){
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorResponseDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(authorService.findById(id));
}

    @PutMapping("/{id}")
    public ResponseEntity<AuthorResponseDto> updateAuthor(@PathVariable Integer id ,
                                                          @RequestBody AuthorRequestDto dto){
        return ResponseEntity.ok().body(authorService.updateAuthor(id,dto));
    }
}
