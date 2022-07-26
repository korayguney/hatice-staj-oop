package com.roof.oop1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
