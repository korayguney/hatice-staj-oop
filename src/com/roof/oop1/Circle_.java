package com.roof.oop1;

public class Circle_ extends Shape {

    private double radius;

    public Circle_(String color,double radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
