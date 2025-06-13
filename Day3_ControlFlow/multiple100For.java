package controlFlows;

import java.util.Scanner;

public class multiple100For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.print("Multiples of " + number + " below 100 are: ");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0 && i < 100) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}