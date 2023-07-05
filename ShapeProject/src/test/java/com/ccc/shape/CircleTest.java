package com.ccc.shape;

public class CircleTest {
    public static void main(String[] args) {
        // Test 1: Create a default circle
        Circle circle1 = new Circle();
        circle1.printShape();

        // Test 2: Create a named circle
        Circle circle2 = new Circle("Circle 2");
        circle2.printShape();

        // Test 3: Create a circle with a specific radius
        Circle circle3 = new Circle(3.5, "Circle 3");
        circle3.printShape();

        // Test 4: Calculate the perimeter and area
        Circle circle4 = new Circle(2.0, "Circle 4");
        double perimeter = circle4.getPerimeter();
        double area = circle4.getArea();
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        // Test 5: Invalid Circle
        Circle circle5 = new Circle(-4, "Circle 5");
        circle5.printShape();

 
    }
}
