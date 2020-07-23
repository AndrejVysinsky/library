package com.example.library.repository.model;

import java.util.Collection;

public class AuthorEntity {

    private Long id;

    private String name;

    private Collection<BookEntity> bookEntities;

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

    public void addBook(BookEntity bookEntity)
    {
        this.bookEntities.add(bookEntity);
    }

    public void removeBook(BookEntity bookEntity)
    {
        this.bookEntities.remove(bookEntity);
    }
}
