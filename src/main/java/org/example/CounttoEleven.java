package org.example;

import java.util.Scanner;

public class CounttoEleven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        //ask user for a number less than 11
        System.out.println("Enter number less than 11: ");
        number = scanner.nextInt();

        for (int i = number; i <=11; i++) {
            System.out.println(i);

        }

    }

}
