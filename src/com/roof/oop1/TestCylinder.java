package com.roof.oop1;

public class TestCylinder {
    public static void main(String[] args) {

        Circle circle = new Circle(10, "black");
        System.out.println("Area of circle : " + circle.getArea());

        Cylinder cylinder1 = new Cylinder(10, "yellow", 25.67);
        System.out.println("Area of cylinder1 : " + cylinder1.getArea());
        System.out.println("Volume of cylinder1 : " + cylinder1.getVolume());

    }
}
