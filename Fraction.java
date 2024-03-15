/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thayTai;

/**
 *
 * @author nhipham
 */
public class Fraction {
    int den;
    int num;
    
    public Fraction(int num, int den) {
        if (den == 0) {
            System.out.println("Denominator must not be zero");
            return;
        }
        this.num = num;
        this.den = den;
    }

    void setDen(int den) {
        this.den = den;
    }

    int getDen() {
        return den;
    }

    void setNum(int num) {
        this.num = num;
    }

    int getNum() {
        return num;
    }

    Fraction compact() {
        int gcd = gcd(num, den);
        num /= gcd;
        den /= gcd;

        return new Fraction(num, den);
    }

    private int gcd(int num, int den) {
        num = Math.abs(num);
        den = Math.abs(den);
        while (num != den) {
            if (num > den) {
                num -= den;
            } else {
                den -= num;
            }
        }
        return num;
    }

    public Fraction switchFraction() {
        if (num == 0) {
            System.out.println("Denominator must not be zero");
        
        }
     return new Fraction(den, num).compact();
    }

    Fraction add(Fraction other) {
        int newNum = this.getNum() * other.getDen() + other.getNum() * this.getDen();
        int newDen = this.getDen() * other.getDen();
        return new Fraction(newNum, newDen).compact();
    }

    Fraction sub(Fraction other) {
        int newNum = this.getNum() * other.getDen() - other.getNum() * this.getDen();
        int newDen = this.getDen() * other.getDen();
        return new Fraction(newNum, newDen).compact();
    }

    Fraction mul(Fraction other) {
        int newNum = this.getNum() * other.getNum();
        int newDen = this.getDen() * other.getDen();
        return new Fraction(newNum, newDen).compact();
    }

    Fraction div(Fraction other) {
        if (other.getNum() == 0) {
            System.out.println("Cannot divide by zero");
        }
        int newNum = this.getNum() * other.getDen();
        int newDen = this.getDen() * other.getNum();
        return new Fraction(newNum, newDen).compact();
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 6);
        Fraction f2 = new Fraction(3, 5);

        System.out.println("Fraction 1 after compact: " + f1.compact().num + "/" + f1.compact().den);
        System.out.println("Fraction 1 after switch: " + f1.switchFraction().num + "/" + f1.switchFraction().den);
        System.out.println("Fraction 1 + Fraction 2 = " + f1.add(f2).num + "/" + f1.add(f2).den);
        System.out.println("Fraction 1 -  Fraction 2 = " + f1.sub(f2).num + "/" + f1.sub(f2).den);
        System.out.println("Fraction 1 / Fraction 2 = " + f1.div(f2).num  + "/" + f1.div(f2).den);
        System.out.println("Fraction 1 * Fraction 2 = " + f1.mul(f2).num + "/" + f1.mul(f2).den);
    }
}
