package com.ccc.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    public void testDefaultConstructor() {
        Square square = new Square();
        Assertions.assertEquals(0.0, square.getWidth());
        Assertions.assertEquals(0.0, square.getHeight());
    }

    @Test
    public void testNamedSquare() {
        Square square = new Square(5.0, "Square ABCD");
        square.printShape();

        Assertions.assertEquals("Square ABCD", square.getName());
        Assertions.assertEquals(5.0, square.getWidth());
        Assertions.assertEquals(5.0, square.getHeight());
    }

    @Test
    public void testCustomSquare() {
        Square square = new Square(7.0, "Square XYZT");
        square.printShape();

        Assertions.assertEquals("Square XYZT", square.getName());
        Assertions.assertEquals(7.0, square.getWidth());
        Assertions.assertEquals(7.0, square.getHeight());
    }

    @Test
    public void testPerimeterAndArea() {
        Square square = new Square(4.0, "Square PQRS");
        double perimeter = square.getPerimeter();
        double area = square.getArea();

        Assertions.assertEquals("Square PQRS", square.getName());
        Assertions.assertEquals(4.0, square.getWidth());
        Assertions.assertEquals(4.0, square.getHeight());
        Assertions.assertEquals(16.0, perimeter);
        Assertions.assertEquals(16.0, area);
    }
}
