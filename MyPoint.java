/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thayTai;

/**
 *
 * @author nhipham
 */
public class MyPoint {
    int mPosX;
    int mPosY;
    
    MyPoint(int mPosX, int mPosY) {
        this.mPosX = mPosX;
        this.mPosY = mPosY;
    }
    MyPoint() {
        mPosX = 0;
        mPosY = 0;
    }
    private void display() {
        System.out.println("X: " + mPosX);
        System.out.println("Y: " + mPosY);
    }
    void setX(int mPosX) {
        this.mPosX = mPosX;
    }
    double getX(){
        return mPosX;
    }
    void setY(int mPosY) {
        this.mPosY = mPosY;
    }
    double getY() {
        return mPosY;
    }
    int distance(MyPoint p) {
        int distance = (int) Math.sqrt(Math.pow((p.getX() - mPosX),2) + Math.pow((p.getY() - mPosY), 2));
        System.out.println("Distacne: " + distance);
        return distance;
    }
    int distance1(MyPoint other) {
        int distance = (int) Math.sqrt(Math.pow((other.getX() - this.getX()),2) + Math.pow((other.getY() - this.getY()), 2));
        System.out.println("Distacne: " + distance);
        return distance;
    }
    public static void main(String[] args) {
        MyPoint s1 = new MyPoint();
        MyPoint s2 = new MyPoint(3,7);
        MyPoint s3 = new MyPoint(1,4);
        s3.display();
        s1.distance(s3);
        s2.distance1(s3);
        
        
        
        
        
        
        
    }
}
