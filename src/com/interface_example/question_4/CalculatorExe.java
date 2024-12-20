package com.interface_example.question_4;

import com.interface_example.Calculator;

public class CalculatorExe {
    public static void main(String[] args) {
//        lembda expression to calculate
        Calculator add = (a, b) -> a + b;

        Calculator sub=(a, b) -> a-b;

        Calculator mul=(a,b)->a*b;


        System.out.println("Sum of 90 and 88 is "+add.calculator(90,88));
        System.out.println("Subtraction of 90 and 88 is "+sub.calculator(90,88));
        System.out.println("Multiplicatoin of 90 and 88 is "+mul.calculator(90,88));

    }
}
