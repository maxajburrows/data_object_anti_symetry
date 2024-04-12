package org.geomerty.oop.shapes;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class EquilateralTriangle implements Shape {

    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return sqrt(3)*pow(side, 2)/4;
    }

    @Override
    public double calculatePerimeter() {
        return 3*side;
    }
}
