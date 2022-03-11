package com.example.LibraryManagement.Dto;

//import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

public class UserBookHistory implements Serializable {

    @NotNull
    private Integer id;
    private Integer userid;
    private Integer bookid;

    private String s_date;
    private String e_date;

    public UserBookHistory(@NotNull Integer id, Integer userid, Integer bookid, String s_date, String e_date) {
        this.id = id;
        this.userid = userid;
        this.bookid = bookid;
        this.s_date = s_date;
        this.e_date = e_date;
    }

    public UserBookHistory(){ }

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

    public void setE_dae(String e_date) {
        this.e_date = e_date;
    }
}
