/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thayTai;

import java.util.Scanner;

/**
 *
 * @author nhipham
 */
public class Student {
    String name;
    String class1;
    double grade;
    Student(String name, String class1, double grade) {
        this.name = name;
        this.grade = grade;
        this.class1 = class1;
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setClass(String class1) {
        this.class1 = class1;
    }
    String getClass1() {
        return class1;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    double getGrade() {
        return grade;
    }
    void upperName() {
        name = name.toUpperCase();
    }
    void lowerName() {
        name = name.toLowerCase();
    }
    void print() {
        System.out.println("Name: " + getName());
        System.out.println("Class: " + getClass1());
        System.out.println("Grade: " + getGrade());
    }
    public String toString() {
    return "Name: " + getName() + "\nClass: " + getClass1() + "\nGrade: " + getGrade();
}

}