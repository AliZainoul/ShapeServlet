package com.ccc.shape;

import java.lang.Math;

public class Triangle extends Shape {
    // Members
    double a;
    double b;
    double c;

    // Constructors
    // Default Constructor
    public Triangle() {
        super("");
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    // Default Constructor 2
    public Triangle(String name) {
        super(name);
    }

    // Initializer Constructor
    public Triangle(double a, double b, double c, String name) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Methods

    // Validation method
    public boolean validateTriangle() {
        boolean validTriangle = validateShape(a+b > c && b+c > a && a+c > b );
        return (validTriangle);
    }

    @Override
    public double getPerimeter() {
        if (validateShape((a == 0 || b == 0 || c == 0)))
            return 0.0;
        if (validateTriangle()) {
            double perimeter = (a + b + c);
            return (perimeter);
        } 
        else {
            return -1.0; // or any other appropriate value for an invalid triangle
        }   
    }


    @Override
    public double getArea() {
        if (validateShape((a == 0 || b == 0 || c == 0)))
            return 0.0;
        if (validateTriangle()) {
            // HERON'S FORMULA FOR CALCULATING AREA OF TRIANGLE BASED ON
            // params: @a, @b, @c
            double s = (a + b + c) / 2.0;
            double product_s = (s * (s - a) * (s - b) * (s - c));
            double area = Math.sqrt(product_s);
            return area;
        }
        else {
            return -1.0; // or any other appropriate value for an invalid triangle
        }   
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Setters
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Helpers
    @Override
    public void printShape() {
        System.out.println(
                "--------------------------------------------------\n" +
                        "Name of Triangle: " + getName() + "\n" +
                        "Vertexes = (" + getA() + ", " + getB() + ", " + getC() + ")\n" +
                        "Area of my Triangle = " + getArea() + "\n" +
                        "--------------------------------------------------\n"
        );
    }

    @Override
    public String _printShape() {
        return "--------------------------------------------------" +
                "Name of Triangle: " + getName() + "\n" +
                "Vertexes = (" + getA() + ", " + getB() + ", " + getC() + ")\n" +
                "Area of my Triangle = " + getArea() + "\n" +
                "--------------------------------------------------\n";
    }

    @Override
    public String __printShape() {
    return "<hr>" +
            "<p><b>Name of Triangle:</b> " + getName() + "</p>" +
            "<p><b>Vertexes:</b> (" + getA() + ", " + getB() + ", " + getC() + ")</p>" +
            "<p><b>Perimeter of my Triangle:</b> " + getPerimeter() + "</p>" +
            "<p><b>Area of my Triangle:</b> " + getArea() + "</p>" +
            "<hr>";
    }

}
