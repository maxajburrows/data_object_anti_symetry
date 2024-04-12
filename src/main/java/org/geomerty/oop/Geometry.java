package org.geomerty.oop;


import org.geomerty.oop.shapes.*;

public class Geometry {
    public static void main(String[] args) {
        Point squareTopLeftPoint = new Point(2.5, 4.5);
        Square square = new Square(squareTopLeftPoint, 3.0);
        System.out.println("Area of square is " + square.calculateArea());
        System.out.println("Perimeter of square is " + square.calculatePerimeter());

        Point rectangleTopLeftPoint = new Point(10.0, 5.0);
        Rectangle rectangle = new Rectangle(rectangleTopLeftPoint, 4.0, 5.0);
        System.out.println("Area of rectangle is " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle is " + rectangle.calculatePerimeter());

        Point circleCenter = new Point(8.7, 4.0);
        Circle circle = new Circle(circleCenter, 6.3);
        System.out.println("Area of circle is " + circle.calculateArea());
        System.out.println("Perimeter of circle is " + circle.calculatePerimeter());

        EquilateralTriangle triangle = new EquilateralTriangle(10.0);
        System.out.println("Area of triangle is " + triangle.calculateArea());
        System.out.println("Perimeter of triangle is " + triangle.calculatePerimeter());
    }
}
