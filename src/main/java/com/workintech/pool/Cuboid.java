package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    // Constructor
    public Cuboid(double width, double length, double height) {
        super(width, length); // Call to Rectangle constructor
        setHeight(height);
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }

    // Method to calculate volume
    public double getVolume() {
        return getArea() * height; // Area of base * height
    }
}
