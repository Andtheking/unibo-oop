package it.unibo.shapes.api;

import java.lang.Math;

public class Triangle implements Polygon {

    private final double side1;
    private final double side2;
    private final double side3;

    private final int sides = 3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getEdgeCount() {
        return this.sides;
    }

    public double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
}