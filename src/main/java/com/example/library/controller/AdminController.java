package com.example.library.controller;

import com.example.library.dto.Author;
import com.example.library.dto.Book;
import com.example.library.repository.model.AuthorEntity;
import com.example.library.repository.model.BookEntity;
import com.example.library.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("services/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/author")
    public AuthorEntity createAuthor(@RequestBody Author author)
    {
        return adminService.createAuthor(author);
    }

    @PostMapping("/book")
    public BookEntity createBook(@RequestBody Book book)
    {
        return adminService.createBook(book);
    }

}
