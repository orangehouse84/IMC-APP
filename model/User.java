/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

// User.java (Java Bean for User data)


public class User {
    private String username;
    private String password;
     private String name;
    private int age;
    private String gender; 

    public User(String username, String password, String name, int age, String gender) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
     public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

