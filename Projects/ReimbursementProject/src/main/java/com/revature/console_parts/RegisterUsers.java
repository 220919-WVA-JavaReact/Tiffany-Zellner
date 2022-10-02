package com.revature.console_parts;

import java.util.Scanner;

public class RegisterUsers {


    public static void main(String[] args){
        String first;
        String last;
        String username;
        String password;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name? ");
        first = input.next();
        System.out.println("Please enter your last name? ");
        last = input.next();
        System.out.println("Please enter your username? ");
        username = input.next();
        System.out.println("Please enter your password? ");
        password = input.next();
    }
}
