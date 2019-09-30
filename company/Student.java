package com.company;

public class Student {
    private String Name;
    private int age;
    private int Id;

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return Id;
    }
}
