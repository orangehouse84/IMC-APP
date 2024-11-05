/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

public class BMIHistory {
    public LocalDate date;
    public double weight;
    public double bmi;
    private String username; // Added username property

    // Constructor
    public BMIHistory(LocalDate date, double weight, double bmi, String username) { // Updated constructor
        this.date = date;
        this.weight = weight;
        this.bmi = bmi;
        this.username = username;
    }

    // Getters and Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getUsername() { // Getter for username
        return username;
    }

    public void setUsername(String username) { // Setter for username
        this.username = username;
    }
}

