package com.example.LibraryManagement.Controller;

import com.example.LibraryManagement.Dto.Books;
import com.example.LibraryManagement.Dto.User;
import com.example.LibraryManagement.Dto.UserBookHistory;
import com.example.LibraryManagement.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @PostMapping("/book")
    public void addBook(@RequestBody Books books){
        libraryService.addBook(books);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        libraryService.addUser(user);
    }

    @PostMapping("/issue")
    public void issueBook(@RequestBody UserBookHistory userBookHistory){
        libraryService.issueBook(userBookHistory);
    }

    @PutMapping("/return")
    public void returnBook(@RequestBody UserBookHistory userBookHistory1){
        libraryService.returnBook(userBookHistory1);
    }
}
