package com.ucom.book_catalog.sevice;

import com.ucom.book_catalog.dto.request.AuthorRequestDto;
import com.ucom.book_catalog.dto.response.AuthorResponseDto;

import java.util.List;

public interface AuthorService {

    public AuthorResponseDto createNewAuthor(AuthorRequestDto dto);

    public List<AuthorResponseDto>findAll();

    public AuthorResponseDto findById(Integer id);

    public AuthorResponseDto updateAuthor(Integer id,AuthorRequestDto dto);
}
