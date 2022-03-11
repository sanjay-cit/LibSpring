package com.example.LibraryManagement.Entity;

import com.example.LibraryManagement.Dto.Books;
import com.example.LibraryManagement.Dto.User;

import javax.persistence.*;

@Entity
@Table(name = "User_Book_History")
public class HistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Id
    @GeneratedValue
    private Integer userid, bookid;
    private String s_date,e_date;
    private BooksEntity booksEntity;
    private UserEntity userEntity;

//    @ManyToOne(cascade = CascadeType.ALL)
//    private Books books;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    private User user;

    public HistoryEntity(Integer id, Integer userid, Integer bookid, String s_date, String e_date) {
        this.id = id;
        this.userid=userid;
        this.bookid=bookid;
        this.s_date = s_date;
        this.e_date = e_date;
    }

    public HistoryEntity(){ }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getS_date() {
        return s_date;
    }

    public void setS_date(String s_date) {
        this.s_date = s_date;
    }

    public String getE_date() {
        return e_date;
    }

    public void setE_date(String e_date)  {
        this.e_date = e_date;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public BooksEntity getBooksEntity() {
        return booksEntity;
    }

    public void setBooksEntity(BooksEntity booksEntity) {
        this.booksEntity = booksEntity;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    //    public Books getBooks() {
//        return books;
//    }
//
//    public void setBooks(Books books) {
//        this.books = books;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
