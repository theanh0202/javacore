package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

import java.lang.ref.PhantomReference;

@Getter
@Setter
public class User {
    protected int id;
    protected String fullName;
    protected   String email;
    protected String passWord;
    protected int projectId;
    protected Role role;
}
