package org.geomerty.oop.shapes;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private Point center;
    private double radius;
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}
