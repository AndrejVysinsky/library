package com.example.library.service;

import com.example.library.dto.Author;
import com.example.library.repository.model.AuthorEntity;

public class AdminService {

    public AuthorEntity createAuthor(Author author)
    {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setId(1L);
        authorEntity.setName(author.getName());
        return authorEntity;
    }
}
