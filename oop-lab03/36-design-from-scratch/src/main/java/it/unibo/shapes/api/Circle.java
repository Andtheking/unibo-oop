package it.unibo.shapes.api;

import java.lang.Math;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}