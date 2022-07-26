package com.roof.oop1;

public class Pen {

    // Overloading...
    public void draw (Rectangle r){
        System.out.println(r.getColor() + " rectange is drew ...");
    }

    public void draw (Circle_ c){
        System.out.println(c.getColor() + " circle is drew ...");
    }

    public void changeColor(String color, Rectangle r){
        r.setColor(color);
        this.draw(r);
    }
    public void changeColor(String color, Circle_ c  ){
        c.setColor(color);
        this.draw(c);
    }

}
