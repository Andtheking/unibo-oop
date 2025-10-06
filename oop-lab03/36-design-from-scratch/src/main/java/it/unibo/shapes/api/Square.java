package it.unibo.shapes.api;

class Square implements Polygon {
    private final int sides = 4;
    private int side_length;

    public Square(int side_length) {
        this.side_length = side_length;
    }

    public int getSideLength() {
        return side_length;
    }

    public int getEdgeCount() {
        return sides;
    }

    public double area() {
        return Math.pow(this.sides, 2);
    }

    public double perimeter() {
        return this.sides * 4;
    }
}