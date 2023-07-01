package com.ccc.shape;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean validateShape(boolean condition) {
        return condition;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public void printShape();
    abstract public String _printShape();
    abstract public String __printShape();
    
}
