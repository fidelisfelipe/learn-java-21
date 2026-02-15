package com.learn.java21;

import java.time.Duration;
import java.util.concurrent.Executors;

/**
 * Demonstrates Virtual Threads (JEP 444)
 * Standard feature in Java 21
 */
public class VirtualThreadExample {
    
    public static void demonstrate() {
        System.out.println("\n3. Virtual Threads Example:");
        System.out.println("---------------------------");
        
        // Create and run a virtual thread
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Running in a virtual thread: " + Thread.currentThread());
        });
        
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // Using virtual thread executor
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 5; i++) {
                final int taskId = i;
                executor.submit(() -> {
                    System.out.println("Task " + taskId + " running on: " + 
                                     Thread.currentThread().getName());
                });
            }
        }
        
        System.out.println("Virtual threads completed");
    }
}
