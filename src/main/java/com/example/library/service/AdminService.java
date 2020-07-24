package com.example.library.service;

import com.example.library.dto.Author;
import com.example.library.dto.Book;
import com.example.library.repository.AuthorRepository;
import com.example.library.repository.BookRepository;
import com.example.library.repository.model.AuthorEntity;
import com.example.library.repository.model.BookEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    public AuthorEntity createAuthor(Author author)
    {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setName(author.getName());
        AuthorEntity savedEntity = authorRepository.save(authorEntity);
        return savedEntity;
    }

    public BookEntity createBook(Book book)
    {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName(book.getName());
        bookEntity.setNumberOfPages(book.getNumberOfPages());
        BookEntity savedEntity = bookRepository.save(bookEntity);
        return savedEntity;
    }
}
