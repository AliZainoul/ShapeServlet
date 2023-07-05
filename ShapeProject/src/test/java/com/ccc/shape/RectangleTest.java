package com.ccc.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        Assertions.assertEquals(0.0, rectangle.getWidth());
        Assertions.assertEquals(0.0, rectangle.getHeight());
    }

    @Test
    public void testNamedRectangle() {
        Rectangle rectangle = new Rectangle(4.0, 5.0, "Rectangle ABCD");
        rectangle.printShape();

        Assertions.assertEquals("Rectangle ABCD", rectangle.getName());
        Assertions.assertEquals(4.0, rectangle.getWidth());
        Assertions.assertEquals(5.0, rectangle.getHeight());
    }

    @Test
    public void testCustomRectangle() {
        Rectangle rectangle = new Rectangle(6.0, 8.0, "Rectangle XYZT");
        rectangle.printShape();

        Assertions.assertEquals("Rectangle XYZT", rectangle.getName());
        Assertions.assertEquals(6.0, rectangle.getWidth());
        Assertions.assertEquals(8.0, rectangle.getHeight());
    }

    @Test
    public void testInvalidRectangle() {
        Rectangle rectangle = new Rectangle(-1.0, 10.0, "Invalid Rectangle");
        rectangle.printShape();

        Assertions.assertEquals("Invalid Rectangle", rectangle.getName());
        Assertions.assertEquals(-1.0, rectangle.getWidth());
        Assertions.assertEquals(10.0, rectangle.getHeight());
        Assertions.assertEquals(-1.0, rectangle.getPerimeter());
        Assertions.assertEquals(-1.0, rectangle.getArea());
    }

    @Test
    public void testPerimeterAndArea() {
        Rectangle rectangle = new Rectangle(7.0, 3.0, "Rectangle PQRS");
        double perimeter = rectangle.getPerimeter();
        double area = rectangle.getArea();

        Assertions.assertEquals("Rectangle PQRS", rectangle.getName());
        Assertions.assertEquals(7.0, rectangle.getWidth());
        Assertions.assertEquals(3.0, rectangle.getHeight());
        Assertions.assertEquals(20.0, perimeter);
        Assertions.assertEquals(21.0, area);
    }
}
