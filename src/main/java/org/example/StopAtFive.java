package org.example;

import java.util.Scanner;


public class StopAtFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        //loop until the user enters the number 5
        while (number !=5) {
            System.out.println("Give a number: ");
            number = scanner.nextInt();
        }
    }
}
