package com.pojo;

public class User {
    private String name;

//    public User() {
//        System.out.println("default constructor of user!");
//    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show()
    {
        System.out.println("name: " + name);
    }
}
