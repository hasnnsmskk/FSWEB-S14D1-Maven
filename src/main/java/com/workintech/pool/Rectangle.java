package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = Math.max(width, 0);
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = Math.max(length, 0);
    }

    // Method to calculate area
    public double getArea() {
        return width * length;
    }
}
