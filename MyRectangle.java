package thayTai;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import thayTai.MyPoint;
/**
 *
 * @author nhipham
 */
public class MyRectangle {
    private MyPoint mPos;
    private int mWidth;
    private int mHeight;
    
    public MyRectangle() {
       mPos = new MyPoint();
       mWidth = 100;
       mHeight = 100;
    }
    MyRectangle(int x, int y, int width, int height) {
        this.mHeight = height;
        mPos = new MyPoint(x,y);
        this.mWidth = width;
    }
    void display() {
        System.out.println("X: " + mPos.getX());
        System.out.println("Y:"  + mPos.getY());
        System.out.println("Width: " + mWidth);
        System.out.println("Height: " + mHeight);
    }
    void setX(int x) {
        mPos.setX(x);
    }
    int getX() {
        return (int) mPos.getX();
    }
    void setY(int y) {
        mPos.setY(y);
    }
    int getY() {
        return (int) mPos.getY();
    }
    void setPos(MyPoint p) {
        mPos = p;
    }
    MyPoint getPos() {
        return mPos;
    }
    void setWidth(int width) {
        mWidth = width;
    }
    int getWidth() {
        return mWidth;
    }
    void setHeight(int height) {
        mWidth = height;
    }
    int getHeight() {
        return mHeight;
    }
    int area() {
        int area = (int) mWidth * mHeight;
        System.out.println("Area: " + area);
        return area;
    }
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle();
        MyRectangle r2 = new MyRectangle(1, 3, 50, 100);
        
        r1.display();
        r1.area();
        r2.display();
        r2.area();
    }
}

