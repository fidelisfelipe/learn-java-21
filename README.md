# Learn Java 21

A simple project to learn Java 21 features for certification and professional development.

## Overview

This project demonstrates key features introduced in Java 21, including:

1. **Record Patterns (JEP 440)** - Destructuring records in pattern matching
2. **String Templates (JEP 430)** - Preview feature for string interpolation
3. **Virtual Threads (JEP 444)** - Lightweight threads for improved concurrency
4. **Pattern Matching for switch** - Enhanced switch expressions with pattern matching
5. **Sealed Classes** - Restricted class hierarchies

## Prerequisites

- Java 21 or later (OpenJDK or Oracle JDK)
- Maven 3.6 or later

## Project Structure

```
learn-java-21/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── learn/
│   │               └── java21/
│   │                   ├── Main.java
│   │                   ├── RecordPatternExample.java
│   │                   ├── StringTemplateExample.java
│   │                   ├── VirtualThreadExample.java
│   │                   └── PatternMatchingExample.java
│   └── test/
│       └── java/
│           └── com/
│               └── learn/
│                   └── java21/
│                       └── (test classes)
├── pom.xml
└── README.md
```

## Building the Project

To compile the project:

```bash
mvn clean compile
```

## Running the Application

To run the main application:

```bash
mvn exec:java -Dexec.mainClass="com.learn.java21.Main"
```

Or build and run the JAR:

```bash
mvn clean package
java --enable-preview -jar target/learn-java-21-1.0.0.jar
```

## Running Tests

To run all tests:

```bash
mvn test
```

## Java 21 Features Demonstrated

### 1. Record Patterns
Shows how to destructure records in pattern matching for cleaner code.

### 2. String Templates (Preview)
Demonstrates string formatting alternatives available in Java 21.

### 3. Virtual Threads
Examples of creating and using lightweight virtual threads for better concurrency.

### 4. Pattern Matching
Enhanced switch expressions with pattern matching for sealed types.

## Learning Resources

- [Oracle Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- [OpenJDK JEPs for Java 21](https://openjdk.org/projects/jdk/21/)
- Java SE 21 Certification Guide

## License

This project is for educational purposes.