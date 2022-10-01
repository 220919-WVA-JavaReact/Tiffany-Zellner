package com.revature.calculator;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.*;

public class Calculator {

    public static void main(String[] args){

        double num1 = 0;
        double num2 = 0;
        char operator;
        double answer = 0;
        char isRunning = 'y';

        Scanner input = new Scanner(System.in);

        while (isRunning == 'y') {

            System.out.println("What operator? ");
            operator = input.next().charAt(0);
            System.out.println("Please enter your first number: ");
            num1 = input.nextInt();
            System.out.println("Please enter your second number: ");
            num2 = input.nextInt();

            if (operator == '+') {
                answer = num1 + num2;
            } else if (operator == '-') {
                answer = num1 - num2;
            } else if (operator == '/') {
                answer = num1 / num2;
            } else if (operator == '*') {
                answer = num1 * num2;
            } else {
                System.out.println("Invalid operator, please try again");
            }

            System.out.println(answer);
            System.out.println("Try again? Y for yes, N for no ");
            isRunning = input.next().charAt(0);

        }
    }
}
