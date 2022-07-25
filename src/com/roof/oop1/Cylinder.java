package com.roof.oop1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        // 2πr(h + r)
        return 2 * Math.PI * getRadius() * (this.height + this.getRadius()) ;
    }

    public double getVolume() {
        // πr2*h
        return super.getArea() * this.height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
