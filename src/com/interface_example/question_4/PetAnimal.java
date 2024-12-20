package com.interface_example.question_4;

public class PetAnimal implements Animal{
    @Override
    public void sound() {
        System.out.println("Animal cry");
    }
    public void play(){
        System.out.println("Animal can play with human");
    }
}


class Dog extends PetAnimal{
    @Override
    public void sound() {
        System.out.println("Dog can bark at human");
    }

    @Override
    public void play() {
        System.out.println("Dog can play with human");
    }
}