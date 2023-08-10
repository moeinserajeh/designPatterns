package com.example.designpattern.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory
{

    private static final HashMap cricleCache = new HashMap();

    public static Shape getCircle(String color)
    {
        Circle circle = (Circle) cricleCache.get(color);

        if (circle == null)
        {
            circle = new Circle(color);
            cricleCache.put(color, circle);
            System.out.println("There is no cached object so Creating circle of color : " + color);
        }
        return circle;
    }

}
