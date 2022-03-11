package com.example.LibraryManagement.Entity;

import com.example.LibraryManagement.Dto.UserBookHistory;

import javax.persistence.*;

@Entity
@Table(name = "usertable")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name, address, ph_no;

//    @OneToOne(cascade = CascadeType.ALL)
//    private UserBookHistory userBookHistory;

    public UserEntity(Integer id, String name, String address, String ph_no) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ph_no = ph_no;
    }

    public UserEntity(){ }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

//    public UserBookHistory getUserBookHistory() {
//        return userBookHistory;
//    }
//
//    public void setUserBookHistory(UserBookHistory userBookHistory) {
//        this.userBookHistory = userBookHistory;
//    }
}
