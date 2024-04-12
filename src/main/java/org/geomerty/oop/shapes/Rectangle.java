package org.geomerty.oop.shapes;

public class Rectangle implements Shape {
    private Point topLeft;
    private double height;
    private double width;
    public Rectangle(Point topLeft, double height, double width) {
        this.topLeft = topLeft;
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(height+width);
    }
}
