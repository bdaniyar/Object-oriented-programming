package io.app;

import java.util.Scanner;

public class SafeDividerPr1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Enter first integer: ");
                int x1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter second integer: ");
                int x2 = Integer.parseInt(scanner.nextLine());

                int result = x1 / x2;

                System.out.println("Result: " + result);

            }

            catch(ArithmeticException e){
                System.out.println("Error: Division by zero is not allowed");
            }
            catch(NumberFormatException e){
                System.out.println("Error: Please enter valid integers");
            }

            System.out.println("Try again...\n");
        }
    }
}
