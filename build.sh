#!/bin/bash
# Simple build script for Java 21 project
# This script compiles the Java files without requiring Maven to download dependencies

echo "Building Java 21 Learning Project..."
echo "======================================"

# Check Java version
if ! command -v javac &> /dev/null; then
    echo "Error: javac not found. Please install Java 21 or later."
    exit 1
fi

JAVA_VERSION=$(java -version 2>&1 | head -n 1 | cut -d'"' -f2 | cut -d'.' -f1)
if [ "$JAVA_VERSION" -lt 21 ]; then
    echo "Warning: Java $JAVA_VERSION detected. Java 21 or later is recommended."
fi

# Create output directories
mkdir -p target/classes
mkdir -p target/test-classes

# Compile main sources
echo ""
echo "Compiling main sources..."
javac --enable-preview -source 21 -d target/classes src/main/java/com/learn/java21/*.java

if [ $? -eq 0 ]; then
    echo "✓ Main sources compiled successfully"
else
    echo "✗ Failed to compile main sources"
    exit 1
fi

# Compile test sources (if JUnit is available)
if [ -f "/tmp/junit-jupiter-api-5.10.1.jar" ]; then
    echo ""
    echo "Compiling test sources..."
    javac --enable-preview -source 21 \
        -cp "target/classes:/tmp/*" \
        -d target/test-classes \
        src/test/java/com/learn/java21/*.java 2>&1 | grep -v "warning: unknown enum constant"
    
    if [ $? -eq 0 ]; then
        echo "✓ Test sources compiled successfully"
    else
        echo "✗ Failed to compile test sources"
    fi
else
    echo ""
    echo "Skipping tests (JUnit not found in /tmp)"
fi

echo ""
echo "Build completed successfully!"
echo "To run the application:"
echo "  java --enable-preview -cp target/classes com.learn.java21.Main"
