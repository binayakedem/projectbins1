package com.interface_example.question_3;

public interface Vehicle {
    default void startEngine(){
        System.out.println("This is default interface method about the start Engine");
    };
    default void stopEngine(){
        System.out.println("This is default method stop engine method");
    };
}
