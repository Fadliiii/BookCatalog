package com.ucom.book_catalog.sevice.impl;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author fadli a.k.a. FadliLlatul Umam
Java Developer
Created on 25/06/2025 21:03
@Last Modified 25/06/2025 21:03
Version 1.0
*/

import com.ucom.book_catalog.dto.response.AuthorResponseDto;
import com.ucom.book_catalog.dto.response.BadRequestException;
import com.ucom.book_catalog.model.Author;
import com.ucom.book_catalog.dto.request.AuthorRequestDto;
import com.ucom.book_catalog.repository.AuthorRepository;
import com.ucom.book_catalog.sevice.AuthorService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final ModelMapper modelMapper;

    @Override
    public AuthorResponseDto createNewAuthor(AuthorRequestDto dto) {
        //mapping dari DTO ke entity
        Author author = modelMapper.map(dto, Author.class);

        //simpan keDB
        Author savedAuthor= authorRepository.save(author);

        //maping dari Entity ke Response DTO
        return modelMapper.map(savedAuthor,AuthorResponseDto.class);
    }

    @Override
    public List<AuthorResponseDto> findAll() {
        return authorRepository.findAll().stream().
                map(author -> modelMapper.map(author,AuthorResponseDto.class))
                .toList();
    }

    @Override
    public AuthorResponseDto findById(Integer id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(()-> new BadRequestException("Invalid author ID "+ "Method findById"));

        AuthorResponseDto dtos = new AuthorResponseDto();
        dtos.setId(author.getId());
        dtos.setName(author.getName());
        dtos.setBirthDate(author.getBirthDate());
        dtos.setBookTitle(author.getBookTitle());

        return dtos;
    }

    @Override
    public AuthorResponseDto updateAuthor(Integer id, AuthorRequestDto dto) {
        Author author = authorRepository.findById(id)
                .orElseThrow(()->new BadRequestException("Invalid Author ID "+ "Method updateAuthor"));
        author.setName(dto.getName());
        author.setBookTitle(dto.getBookTitle());
        author.setBirthDate(dto.getBirthDate());

        authorRepository.save(author);

        return modelMapper.map(author,AuthorResponseDto.class);
    }
}
