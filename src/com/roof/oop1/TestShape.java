package com.roof.oop1;

public class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("yellow",4,5);
        System.out.println("Area of rectangle: "+rectangle1.getArea());
        Circle_ circle1=new Circle_("blue",3);
        System.out.println("Area of circle: "+circle1.getArea());
    }


}
