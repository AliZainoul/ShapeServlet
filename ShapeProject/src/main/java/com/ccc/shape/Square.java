package com.ccc.shape;

public class Square extends Rectangle {
    // Constructors
    // Default Constructor
    public Square() {
        super();
    }

    // Initializer Constructor
    public Square(double side, String name) {
        super(side, side, name);
    }

    // Getters and Setters
    // No additional getters/setters needed since inherited from Rectangle

    // Helpers
    @Override
    public void printShape() {
        System.out.println(
            "--------------------------------------------------\n" +
            "Name of Square: " + getName() + "\n" +
            "Side = " + getWidth() + "\n" +
            "Area of my Square = " + getArea() + "\n" +
            "--------------------------------------------------"
        );
    }

    @Override
    public String _printShape() {
        return "--------------------------------------------------\n" +
                "Name of Square: " + getName() + "\n" +
                "Side = " + getWidth() + "\n" +
                "Area of my Square = " + getArea() + "\n" +
                "--------------------------------------------------\n";
    }

    @Override
    public String __printShape() {
        return "<hr>" +
                "<p><b>Name of Square:</b> " + getName() + "</p>" +
                "<p><b>Side:</b> " + getWidth() + "</p>" +
                "<p><b>Perimeter of my Square:</b> " + getPerimeter() + "</p>" +
                "<p><b>Area of my Square:</b> " + getArea() + "</p>" +
                "<hr>";
    }
}
