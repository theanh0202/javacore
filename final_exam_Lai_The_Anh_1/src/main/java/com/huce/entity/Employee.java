package com.huce.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee extends User{
    private int projectId;
    private String proSkill;
}
