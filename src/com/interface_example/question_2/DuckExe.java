package com.interface_example.question_2;

public class DuckExe {
    public static void main(String[] args) {
        System.out.println("Displaying each of interface in duck class:");

        Duck duck = new Duck();
        System.out.println("This is flyable method declared in first interface:");
        duck.flyable();
        System.out.println("This is swimmable method declared in second interface:");
        duck.swimmable();
    }
}
