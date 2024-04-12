package org.geomerty.oop.shapes;

public class Square implements Shape {
    private Point topLeft;
    private double side;
    public Square(Point topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
