package com.learn.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RecordPatternExample
 */
class RecordPatternExampleTest {
    
    @Test
    void testRecordCreation() {
        RecordPatternExample.Point point = new RecordPatternExample.Point(5, 10);
        assertEquals(5, point.x());
        assertEquals(10, point.y());
    }
    
    @Test
    void testRectangleCreation() {
        RecordPatternExample.Point topLeft = new RecordPatternExample.Point(0, 0);
        RecordPatternExample.Point bottomRight = new RecordPatternExample.Point(10, 20);
        RecordPatternExample.Rectangle rect = new RecordPatternExample.Rectangle(topLeft, bottomRight);
        
        assertNotNull(rect);
        assertEquals(topLeft, rect.topLeft());
        assertEquals(bottomRight, rect.bottomRight());
    }
    
    @Test
    void testDemonstrate() {
        // Should not throw any exceptions
        assertDoesNotThrow(() -> RecordPatternExample.demonstrate());
    }
}
