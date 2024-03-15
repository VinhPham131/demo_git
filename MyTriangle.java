/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thayTai;

/**
 *
 * @author nhipham
 */
public class MyTriangle {
    double a;
    double b;
    double c;
    MyTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void setA(double a) {
        this.a = a;
    }
    double getA() {
        return a;
    }
    void setB(double b) {
        this.b = b;
    }
    double getB() {
        return b;
    }
    void setC(double c) {
        this.c = c;
    }
    double getC() {
        return c;
    }
    void check() {
        if(a + b > c && a + c > b && c + b > a) {
            if (a == b && a == c && c == b) {
            System.out.println("This is an equilateral triangle");
            } else if(a != 0 || b != 0 || c != 0) {
            System.out.println("This is a normal triangle");
            } else if(a == b || b == c || a == c) {
            System.out.println("This is an isosceles triangle");
            } else if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c,2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c,2) || Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a,2) ) {
            System.out.println("This is a right triangle");
            } else {
            System.out.println("This is not a triangle");
            }
        } else {
            System.out.println("This is not a triangle");
        }
        
    }
    double perimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
    double area() {
      double tmp =  perimeter() / 2;
      double area =  Math.sqrt(tmp * (tmp - a) * (tmp - b) * (tmp - c));
      return area;
    }
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(2, 2, 2);
        MyTriangle t2 = new MyTriangle(4, 5, 6);
        t1.check();
        System.out.println("Perimeter: " + t1.perimeter());
        System.out.println("Area: " + t1.area());
        t2.check();
        System.out.println("Perimeter: " + t2.perimeter());
        System.out.println("Area: " + t2.area());
    }
}
