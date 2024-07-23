package org.example;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        //create scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //loop indefinitely until the user enters "yes"
        while (true) {
            //prompt user to take a break
            System.out.println("Do you want to take a break? ");
            //read user's input
            String input = scanner.nextLine();
            //Check if the input is "yes"
            if (input.equals("yes")) {
                break;
            }
        }

    }
}
