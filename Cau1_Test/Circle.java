package thayTai.Cau1_Test;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Area of Circle: " + area();
    }
}
