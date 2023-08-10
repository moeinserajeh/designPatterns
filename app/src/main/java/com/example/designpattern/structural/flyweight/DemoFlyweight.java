package com.example.designpattern.structural.flyweight;

import org.junit.Test;

public class DemoFlyweight {
    private final String[] colors = { "Red", "Green", "Blue", "White", "Black" };

    @Test
    public void demo() {
        for (int i = 0; i < 10; ++i) {
            String targetColor=getRandomColor();
            System.out.println("Target color: "+targetColor);
            Circle circle = (Circle) ShapeFactory.getCircle(targetColor);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(50); circle.draw();
        }
    }
    private  String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
    private int getRandomX() {
        return (int) (Math.random() * 100);
    }
    private int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
