package com.example.library.repository.model;

import com.example.library.dto.Author;

import java.util.Collection;

public class BookEntity {

    private Long id;

    private String name;

    private int numberOfPages;

    private AuthorEntity author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
