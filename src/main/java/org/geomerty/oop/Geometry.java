package org.geomerty.oop;


import org.geomerty.oop.shapes.*;

import java.util.ArrayList;
import java.util.List;

public class Geometry {
    public static void main(String[] args) {
        Point squareTopLeftPoint = new Point(2.5, 4.5);
        Square square = new Square(squareTopLeftPoint, 3.0);

        Point rectangleTopLeftPoint = new Point(10.0, 5.0);
        Rectangle rectangle = new Rectangle(rectangleTopLeftPoint, 4.0, 5.0);

        Point circleCenter = new Point(8.7, 4.0);
        Circle circle = new Circle(circleCenter, 6.3);

        EquilateralTriangle triangle = new EquilateralTriangle(10.0);

        List<Shape> shapes = List.of(square, rectangle, circle, triangle);
        shapes.forEach(shape -> {
            System.out.println("Area of " + shape.getShapeName() + " is " + shape.calculateArea());
            System.out.println("Perimeter of " + shape.getShapeName() + " is " + shape.calculatePerimeter());
        });
    }
}
