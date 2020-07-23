package com.example.library.controller;

import com.example.library.dto.Author;
import com.example.library.repository.model.AuthorEntity;
import com.example.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("services/admin")
public class AdminController {

    private AdminService adminService = new AdminService();

    @PostMapping("/author")
    public AuthorEntity createAuthor(@RequestBody Author author)
    {
        return adminService.createAuthor(author);
    }

}
