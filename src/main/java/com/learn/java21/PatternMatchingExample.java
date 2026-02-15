package com.learn.java21;

/**
 * Demonstrates Pattern Matching improvements in Java 21
 */
public class PatternMatchingExample {
    
    sealed interface Shape permits Circle, Square, Triangle {}
    
    record Circle(double radius) implements Shape {}
    record Square(double side) implements Shape {}
    record Triangle(double base, double height) implements Shape {}
    
    public static void demonstrate() {
        System.out.println("\n4. Pattern Matching Example:");
        System.out.println("----------------------------");
        
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 4.0);
        
        System.out.println("Circle area: " + calculateArea(circle));
        System.out.println("Square area: " + calculateArea(square));
        System.out.println("Triangle area: " + calculateArea(triangle));
    }
    
    private static double calculateArea(Shape shape) {
        return switch (shape) {
            case Circle(double r) -> Math.PI * r * r;
            case Square(double s) -> s * s;
            case Triangle(double b, double h) -> 0.5 * b * h;
        };
    }
}
