package com.roof.oop2;

import com.roof.oop1.Circle_;
import com.roof.oop1.Rectangle;
import com.roof.oop1.Shape;

public class Pen {
    public void draw(Shape s) {
        if (s instanceof Rectangle) {
            System.out.println(s.getColor() + " rectange is drew ...");
        } else if (s instanceof Circle_) {
            System.out.println(s.getColor() + " circle is drew ...");
        }
    }

    public void changeColor(String color, Shape s) {
        s.setColor(color);
        this.draw(s);
    }
}
