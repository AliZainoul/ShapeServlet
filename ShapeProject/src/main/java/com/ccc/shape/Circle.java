package com.ccc.shape;

import java.lang.Math;

public class Circle extends Shape {
    // Members
    private double radius;

    // Constructors

    // Default Constructor
    public Circle() {
        super("");
        this.radius = 0.0;
    }

    // Default Constructor 2
    public Circle(String name) {
        super(name);
    }

    // Initializer Constructor
    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    // Methods
    
    // Validation method
    public boolean validateCircle() {
        return validateShape(radius >= 0);
    }
    @Override
    public double getPerimeter() {
        if (validateCircle())
            return 2 * Math.PI * radius;
        else
            return -1.0;
    }

    @Override
    public double getArea() {
        if (validateCircle())
            return Math.PI * radius * radius;
        else
            return -1.0;
    }

    // Getters
    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    // Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setDiameter(double diameter) {
        this.radius = diameter / 2;
    }

    // Helpers
    @Override
    public void printShape() {
        System.out.println(
                "--------------------------------------------------\n" +
                "Name of circle: " + getName() + "\n" +
                "Radius = " + getRadius() + "\n" +
                "Area of my Circle = " + getArea() + "\n" +
                "--------------------------------------------------\n"
        );
    }

    @Override
    public String _printShape() {
        return "--------------------------------------------------\n" +
                "Name of Circle: " + getName() + "\n" +
                "Radius = " + getRadius() + "\n" +
                "Area of my Circle = " + getArea() + "\n" +
                "--------------------------------------------------\n";
    }

    @Override
    public String __printShape() {
        return "<hr>" +
                "<p><b>Name of Circle:</b> " + getName() + "</p>" +
                "<p><b>Radius:</b> " + getRadius() + "</p>" +
                "<p><b>Perimeter of my Circle:</b> " + getPerimeter() + "</p>" +
                "<p><b>Area of my Circle:</b> " + getArea() + "</p>" +
                "<hr>";
    }
}
