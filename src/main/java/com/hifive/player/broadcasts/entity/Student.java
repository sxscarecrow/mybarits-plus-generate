package com.hifive.player.broadcasts.entity;

import lombok.Data;

@Data
public class Student {

    private Integer age;

    private String name;

    private String sex;

    public Student(){}

    public Student(Integer age, String name, String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
}
