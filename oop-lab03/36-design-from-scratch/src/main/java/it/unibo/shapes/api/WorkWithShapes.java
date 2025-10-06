package it.unibo.shapes.api;

class WorkWithShapes {
    public static void main(String[] args) {
        final Shape circle = new Circle(2);
        final Shape rectangle = new Rectangle(2, 3);
        final Shape square = new Square(2);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());
        
        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());
        
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());    
    }
}