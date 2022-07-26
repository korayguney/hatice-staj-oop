package com.roof.oop1;

public class TestShape {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle("yellow",4,5);
        System.out.println("Area of rectangle: "+rectangle1.getArea());
        Circle_ circle1=new Circle_("blue",3);
        System.out.println("Area of circle: "+circle1.getArea());
        System.out.println("--------------------------");
        Pen pen = new Pen();
        pen.draw((Rectangle) rectangle1);
        pen.draw(circle1);

        pen.changeColor("white",circle1);

    }


}
