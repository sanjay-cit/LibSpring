package com.example.LibraryManagement.Service;

import com.example.LibraryManagement.Dto.Books;
import com.example.LibraryManagement.Dto.User;
import com.example.LibraryManagement.Dto.UserBookHistory;

public interface LibraryService {

    void addBook(Books books);

    void addUser(User user);

    void issueBook(UserBookHistory userBookHistory);

    void returnBook(UserBookHistory userBookHistory1);
}
