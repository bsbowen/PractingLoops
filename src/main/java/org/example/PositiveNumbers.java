package org.example;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        //loop until the user enters the number )
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            //check if the number is positive
            if (number > 0) {
                System.out.println("Number is " + number);
            } else if (number < 0) {
                System.out.println("Number must be a positive number");
            }
        }while (number !=0);
    }
}
