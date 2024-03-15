package thayTai.Cau1_Test;

public class Rectangle extends Shape {
    private double width;
    private double length;
    Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    @Override
    public double area() {
        return width * length;
    }
    @Override
    public String toString() {
        return "Area of Rectangle: " + area();
    }
}
