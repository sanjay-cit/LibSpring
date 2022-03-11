package com.example.LibraryManagement.Entity;

import com.example.LibraryManagement.Dto.UserBookHistory;

import javax.persistence.*;

@Entity
@Table(name = "Books")
public class BooksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name, writer, summary, category;

//    @OneToOne(cascade = CascadeType.ALL)
//    private UserBookHistory userBookHistory;

    public BooksEntity(Integer id, String name, String writer, String summary, String category) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.summary = summary;
        this.category = category;
    }

    public BooksEntity(){ }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public UserBookHistory getUserBookHistory() {
//        return userBookHistory;
//    }
//
//    public void setUserBookHistory(UserBookHistory userBookHistory) {
//        this.userBookHistory = userBookHistory;
//    }
}
