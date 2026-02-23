package pr1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side a: ");
        double a = sc.nextDouble();
        if (a <= 0) {
            System.out.println("Error: side a must be positive.");
            sc.close();
            return;
        }

        double area = a*a;
        double perimeter = 4*a;
        double diagonal = a * Math.sqrt(2);
        sc.close();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}