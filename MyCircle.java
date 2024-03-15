/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thayTai;

/**
 *
 * @author nhipham
 */
public class MyCircle {
    int mPosX;
    int mPosY;
    int mRas;
    
    MyCircle() {
        mPosX = 0;
        mPosY = 0;
        mRas = 10;
    }
    MyCircle(int x, int y, int radius) {
        mPosX = x;
        mPosY = y;
        mRas = radius;
    }
    
    void display() {
        System.out.println("X: " + mPosX + "\nY: " + mPosY);
        System.out.println("Radius: " + mRas);
    }
    void setX(int x) {
        mPosX = x;
    }
    int getX() {
        return mPosX;
    }
    void setY(int y) {
        mPosY = y;
    }
    int getY() {
        return mPosY;
    }
    void setRadius(int radius) {
        mRas = radius;
    }
    int getradius() {
        return mRas;
    }
    int distance(MyCircle c) {
        int distance = (int) Math.sqrt(Math.pow((c.getX() - mPosX),2) + Math.pow((c.getY() - mPosY), 2));
        System.out.println("Distance to C: " + distance);
        return distance;
    }
    int area() {
        int area = (int) (Math.PI * Math.pow(mRas,2));
        System.out.println("Area: " + area);
        return area;
    }
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(1,2,3);
        MyCircle c2 = new MyCircle();
        c1.display();
        c1.distance(c2);
        c1.area();
        
    } 
}
