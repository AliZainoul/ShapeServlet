package com.ccc.shape;

import org.junit.jupiter.api.Test;

public class ShapeTest {

    @Test
    public void testDefaultTriangle() {
        Triangle triangle = new Triangle();
        triangle.setName("Triangle 1");
        triangle.printShape();
    }

    @Test
    public void testNamedTriangle() {
        Triangle triangle = new Triangle("Triangle 2");
        triangle.printShape();
    }

    @Test
    public void testParameterizedTriangle() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Triangle 3");
        triangle.printShape();
    }

    @Test
    public void testDefaultRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setName("Rectangle 1");
        rectangle.printShape();
    }

    @Test
    public void testParameterizedRectangle() {
        Rectangle rectangle = new Rectangle(5.0, 10.0, "Rectangle 2");
        rectangle.printShape();
    }

    @Test
    public void testDefaultSquare() {
        Square square = new Square();
        square.setName("Square 1");
        square.printShape();
    }

    @Test
    public void testParameterizedSquare() {
        Square square = new Square(5.0, "Square 2");
        square.printShape();
    }

    @Test
    public void testDefaultCircle() {
        Circle circle = new Circle();
        circle.setName("Circle 1");
        circle.printShape();
    }

    @Test
    public void testNamedCircle() {
        Circle circle = new Circle("Circle 2");
        circle.printShape();
    }

    @Test
    public void testParameterizedCircle() {
        Circle circle = new Circle(7.5, "Circle 3");
        circle.printShape();
    }

    @Test
    public void testDefaultSquare2() {
        Square square = new Square();
        square.setName("Square 3");
        square.printShape();
    }

    @Test
    public void testParameterizedSquare2() {
        Square square = new Square(8.0, "Square 4");
        square.printShape();
    }
}
