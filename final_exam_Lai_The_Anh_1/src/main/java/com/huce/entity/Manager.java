package com.huce.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manager extends User {
    private String expInYear;
    private int projectId;
}
