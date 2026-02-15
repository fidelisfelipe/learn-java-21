package com.learn.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for PatternMatchingExample
 */
class PatternMatchingExampleTest {
    
    @Test
    void testCircleCreation() {
        PatternMatchingExample.Circle circle = new PatternMatchingExample.Circle(5.0);
        assertEquals(5.0, circle.radius());
    }
    
    @Test
    void testSquareCreation() {
        PatternMatchingExample.Square square = new PatternMatchingExample.Square(4.0);
        assertEquals(4.0, square.side());
    }
    
    @Test
    void testTriangleCreation() {
        PatternMatchingExample.Triangle triangle = new PatternMatchingExample.Triangle(3.0, 4.0);
        assertEquals(3.0, triangle.base());
        assertEquals(4.0, triangle.height());
    }
    
    @Test
    void testDemonstrate() {
        // Should not throw any exceptions
        assertDoesNotThrow(() -> PatternMatchingExample.demonstrate());
    }
}
