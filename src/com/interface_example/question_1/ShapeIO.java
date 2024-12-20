package com.interface_example.question_1;

import java.util.Scanner;

public class ShapeIO {
    Scanner sc = new Scanner(System.in);

    public void inputRectangle(Rectangle rectangle) {
        int len, bre;

        System.out.println("Enter the length of rectangle:");
        len = sc.nextInt();

        System.out.println("Enter the breadth of rectangle:");
        bre = sc.nextInt();
        rectangle.len = len;
        rectangle.bre = bre;

    }

    public void inputCircle(Circle circle) {
        int radius;
        System.out.println("Enter the radius of circle:");
        radius = sc.nextInt();
        circle.radius = radius;
    }
}
