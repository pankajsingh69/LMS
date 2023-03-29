package com.backendmarch.librarymanagementsystem.Controller;

import com.backendmarch.librarymanagementsystem.Entity.Author;
import com.backendmarch.librarymanagementsystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/add")
    public String addauthor(@RequestBody Author author){
        authorService.addAuthor(author);
        return "Author has been added successfully";
    }

    // function to get all the authors
    @GetMapping("/get_author")
    public List<Author> getauthor(){
        return authorService.getAuthors();
    }
}
