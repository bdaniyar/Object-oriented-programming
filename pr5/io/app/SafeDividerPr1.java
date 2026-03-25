package io.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDividerPr1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first integer: ");
                int x1 = scanner.nextInt();

                System.out.print("Enter second integer: ");
                int x2 = scanner.nextInt();

                int result = x1 / x2;

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed");

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid integers");
                scanner.nextLine();
            }

            System.out.println("Try again...\n");
        }
    }
}