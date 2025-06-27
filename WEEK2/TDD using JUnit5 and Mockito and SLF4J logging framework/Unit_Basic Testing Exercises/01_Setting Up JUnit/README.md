# 01_Setting Up JUnit

This folder contains a basic setup for writing and running unit tests in Java using **JUnit 5**, without using a `pom.xml` or full Maven project.

## What This Project Includes

- `Calculator.java`  
  A simple Java class with an `add(int a, int b)` method.

- `CalculatorTest.java`  
  A basic test class using JUnit 5 to test the `add()` method.

## How It Was Set Up

- **JUnit 5** was added to the project via IntelliJ IDEA using:  
  `Project Structure → Libraries → + → From Maven`  
  Dependency added:  org.junit.jupiter:junit-jupiter:5.10.0

  
- No `pom.xml` or build tool (like Maven/Gradle) was used.

## How to Run the Tests

1. Open the project in **IntelliJ IDEA**.
2. Open `CalculatorTest.java`.
3. Right-click on the test method or class → **Run 'CalculatorTest'**.
4. You should see test output in the Run panel .


