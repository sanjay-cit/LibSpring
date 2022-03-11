package com.example.LibraryManagement.Dto;

import com.sun.istack.internal.NotNull;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;

public class User implements Serializable {

    @NotNull
    private Integer id;

    @NotBlank
    private String name;
    private String address;
    private String ph_no;

    public User(Integer id, @NotBlank String name, String address, String ph_no) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ph_no = ph_no;
    }

    public User(){ }

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
}
