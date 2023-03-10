package Bai3;

public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea() {
        return getArea();
    }
    public double getPerimeter() {
        return getPerimeter();
    }

    @Override
    public String toString() {
        return "rectangle{" + "width=" + width + ", length=" + length + '}';
    }
}
