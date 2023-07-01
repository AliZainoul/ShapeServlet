package com.ccc.shape;

public class Rectangle extends Shape {
    // Members
    private double width;
    private double height;

    // Constructors
    // Default Constructor
    public Rectangle() {
        super("");
        this.width = 0.0;
        this.height = 0.0;
    }

    // Initializer Constructor
    public Rectangle(double width, double height, String name) {
        super(name);
        this.width = width;
        this.height = height;
    }

    // Methods

    // Validation method
    public boolean validateRectangle() {
        return validateShape((width >= 0 && height >= 0));
    }
    @Override
    public double getPerimeter() {
        if (validateRectangle())
            return 2 * (width + height);
        else
            return -1.0;
    }

    @Override
    public double getArea() {
        if (validateRectangle())
            return width * height;
        else
            return -1.0;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Helpers
    @Override
    public void printShape() {
        System.out.println(
            "--------------------------------------------------\n" +
            "Name of Rectangle: " + getName() + "\n" +
            "Sides = (" + getWidth() + ", " + getHeight() + ")\n" +
            "Area of my Rectangle = " + getArea() + "\n" +
            "--------------------------------------------------"
        );
    }

    @Override
    public String _printShape() {
        return "--------------------------------------------------\n" +
                "Name of Rectangle: " + getName() + "\n" +
                "Sides = (" + getWidth() + ", " + getHeight() + ")\n" +
                "Area of my Rectangle = " + getArea() + "\n" +
                "--------------------------------------------------\n";
    }

    @Override
    public String __printShape() {
    return "<hr>" +
            "<p><b>Name of Rectangle:</b> " + getName() + "</p>" +
            "<p><b>Sides:</b> (" + getWidth() + ", " + getHeight() + ")</p>" +
            "<p><b>Perimeter of my Rectangle:</b> " + getPerimeter() + "</p>" +
            "<p><b>Area of my Rectangle:</b> " + getArea() + "</p>" +
            "<hr>";
    }

}
