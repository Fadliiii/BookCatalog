package com.ucom.book_catalog.repository;

import com.ucom.book_catalog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author,Integer>{

}
