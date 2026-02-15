package com.learn.java21;

/**
 * Demonstrates String Templates (JEP 430)
 * Preview feature in Java 21
 */
public class StringTemplateExample {
    
    public static void demonstrate() {
        System.out.println("\n2. String Templates Example:");
        System.out.println("----------------------------");
        
        String name = "Java";
        int version = 21;
        
        // Traditional string concatenation
        String message1 = "Welcome to " + name + " " + version + "!";
        System.out.println("Traditional: " + message1);
        
        // Using String.format
        String message2 = String.format("Welcome to %s %d!", name, version);
        System.out.println("String.format: " + message2);
        
        // Note: String Templates are a preview feature
        // They would allow: STR."Welcome to \{name} \{version}!"
        System.out.println("String templates are a preview feature in Java 21");
    }
}
