#!/bin/bash
# Run script for Java 21 project

echo "Running Java 21 Learning Project..."
echo "===================================="
echo ""

# Check if compiled classes exist
if [ ! -d "target/classes" ]; then
    echo "Error: Compiled classes not found. Please run ./build.sh first."
    exit 1
fi

# Run the main application
java --enable-preview -cp target/classes com.learn.java21.Main
