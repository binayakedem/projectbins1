package com.interface_example.question_1;
//Task: Create an interface Shape with a method calculateArea(). Implement this interface in two classes, Circle and Rectangle.
public class ShapeExe {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        ShapeIO shapeIO = new ShapeIO();
        shapeIO.inputRectangle(rectangle);
        shapeIO.inputCircle(circle);


//        now dispaying the result to user
        circle.calculateArea();
        rectangle.calculateArea();
    }
}
