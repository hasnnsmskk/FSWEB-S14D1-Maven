package com.workintech.pool;

public class Rectangle {
    private double width, length;

    public Rectangle(double length, double width) {
        this.length = length< 0 ? 0 : length;
        this.width = width < 0 ? 0: width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return this.width*this.length;
    }
}
