package com.ccc.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testDefaultConstructor() {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(0.0, triangle.getA());
        Assertions.assertEquals(0.0, triangle.getB());
        Assertions.assertEquals(0.0, triangle.getC());
    }

    @Test
    public void testNamedTriangle() {
        Triangle triangle = new Triangle("Triangle ABC");
        triangle.setA(3.0);
        triangle.setB(4.0);
        triangle.setC(5.0);
        triangle.printShape();

        Assertions.assertEquals("Triangle ABC", triangle.getName());
        Assertions.assertEquals(3.0, triangle.getA());
        Assertions.assertEquals(4.0, triangle.getB());
        Assertions.assertEquals(5.0, triangle.getC());
    }

    @Test
    public void testCustomTriangle() {
        Triangle triangle = new Triangle(5.0, 6.0, 7.0, "Triangle XYZ");
        triangle.printShape();

        Assertions.assertEquals("Triangle XYZ", triangle.getName());
        Assertions.assertEquals(5.0, triangle.getA());
        Assertions.assertEquals(6.0, triangle.getB());
        Assertions.assertEquals(7.0, triangle.getC());
    }

    @Test
    public void testInvalidTriangle() {
        Triangle triangle = new Triangle(1.0, 1.0, 10.0, "Invalid Triangle");
        triangle.printShape();

        Assertions.assertEquals("Invalid Triangle", triangle.getName());
        Assertions.assertEquals(1.0, triangle.getA());
        Assertions.assertEquals(1.0, triangle.getB());
        Assertions.assertEquals(10.0, triangle.getC());
    }

    @Test
    public void testPerimeterAndArea() {
        Triangle triangle = new Triangle(8.0, 15.0, 17.0, "Triangle PQR");
        double perimeter = triangle.getPerimeter();
        double area = triangle.getArea();

        Assertions.assertEquals("Triangle PQR", triangle.getName());
        Assertions.assertEquals(8.0, triangle.getA());
        Assertions.assertEquals(15.0, triangle.getB());
        Assertions.assertEquals(17.0, triangle.getC());
        Assertions.assertEquals(40.0, perimeter);
        Assertions.assertEquals(60.0, area);
    }
}
