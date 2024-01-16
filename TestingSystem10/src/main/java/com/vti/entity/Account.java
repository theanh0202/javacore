package com.vti.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {
    public String password;
    private int accountId;
    private String fullName;

    public void setPassword(String password) {
        this.password = password;
    }

    private String email;
    private String username;
}


