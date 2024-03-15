package thayTai.Cau1_VII;

class Rectangle extends shape implements Comparable<Object> {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Area: " + area();
    }

    @Override
    public int compareTo(Object object) {
        shape other = (shape)object; 
        return (int)(this.area() - other.area());
    }
}