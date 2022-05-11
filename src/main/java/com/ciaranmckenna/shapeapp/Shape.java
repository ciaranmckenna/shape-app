package com.ciaranmckenna.shapeapp;

public abstract class Shape {

    private String name;
    private double length;

    protected Shape() {
    }

    protected Shape(String name, double length) {
        this.setName(name);
        this.setLength(length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name.isEmpty()){
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength (double length) throws IllegalArgumentException {
        if (length <= 0){
            throw new IllegalArgumentException("Number can't be zero or a negative number");
        }
        this.length = length;
    }
}
