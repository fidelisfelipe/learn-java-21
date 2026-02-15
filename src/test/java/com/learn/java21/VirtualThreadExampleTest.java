package com.learn.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for VirtualThreadExample
 */
class VirtualThreadExampleTest {
    
    @Test
    void testVirtualThreadCreation() throws InterruptedException {
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            assertTrue(Thread.currentThread().isVirtual());
        });
        virtualThread.join();
    }
    
    @Test
    void testDemonstrate() {
        // Should not throw any exceptions
        assertDoesNotThrow(() -> VirtualThreadExample.demonstrate());
    }
}
