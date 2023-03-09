package Bai3;

public class Circle extends Shape{
    public double radius = 1;
    public double pi = 3.14;

    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * 2 * radius;
    }
    public double getPerimeter() {
        return pi * radius * radius;
    }
    public String toString() {
        return "circle{" + "radius=" + radius + "Area = "+ getArea() + "Perimeter = " + getPerimeter() + "}";
    }
    
}
