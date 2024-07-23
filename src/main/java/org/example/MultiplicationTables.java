package org.example;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        //create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //ask user for a number
        System.out.println("Input a number: ");
        // Read the next integer input from the user and assign it to the variable 'number'
        int number=scanner.nextInt();

        //// Print the multiplication table for the input number up to 10
        for (int i =1; i<=10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }
}
