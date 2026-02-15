package com.learn.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for StringTemplateExample
 */
class StringTemplateExampleTest {
    
    @Test
    void testDemonstrate() {
        // Should not throw any exceptions
        assertDoesNotThrow(() -> StringTemplateExample.demonstrate());
    }
}
