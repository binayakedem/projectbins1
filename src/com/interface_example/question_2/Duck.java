package com.interface_example.question_2;

public class Duck implements Flyable, Swimmable {
    @Override
    public void flyable() {
        System.out.println("The duc is flyable bird");
    }

    @Override
    public void swimmable() {
        System.out.println("The duck is swimmable bird");
    }
}
