package Bai3;

public class Square extends Rectangle {
    double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square( String color, boolean filled, double side) {
        super.color = color;
        super.filled = filled;
        this.side = side;
        
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public void setWidth(double side) {
        this.side = side;
    }


    public void setLength(double side) {
        this.side = side;
    }


    public String toString() {
        return "square{" + "side=" + side + '}';
    }
    
    
}
