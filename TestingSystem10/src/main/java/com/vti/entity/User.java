package com.vti.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private int id;
    private Role role;
    private String userName;
    private String passWord;
    private String email;
    private String dateOfBirth;
    private Department department;
}




