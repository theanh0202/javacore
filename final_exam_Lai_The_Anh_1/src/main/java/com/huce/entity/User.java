package com.huce.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    protected int id;
    protected String fullName;
    protected String email;
    protected String passWord;
    protected Role role;
}
