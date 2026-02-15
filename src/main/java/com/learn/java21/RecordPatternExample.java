package com.learn.java21;

/**
 * Demonstrates Record Patterns (JEP 440)
 * Standard feature in Java 21
 */
public class RecordPatternExample {
    
    // Define a record for Point
    record Point(int x, int y) {}
    
    // Define a record for Rectangle
    record Rectangle(Point topLeft, Point bottomRight) {}
    
    public static void demonstrate() {
        System.out.println("\n1. Record Patterns Example:");
        System.out.println("---------------------------");
        
        Rectangle rect = new Rectangle(new Point(0, 0), new Point(10, 20));
        printRectangleArea(rect);
    }
    
    private static void printRectangleArea(Object obj) {
        if (obj instanceof Rectangle(Point(int x1, int y1), Point(int x2, int y2))) {
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            System.out.println("Rectangle area: " + (width * height));
        }
    }
}
