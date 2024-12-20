package com.interface_example.question_1;

public class Rectangle implements Shape {
    int len, bre;

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle is:" + (len * bre));
    }
}

class Circle implements Shape {
    int radius;

    @Override
    public void calculateArea() {
        System.out.println("Area of circle is :" + (Math.PI * radius * radius));

    }
}