package pr1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double D = b*b - 4*a*c;

        if (D < 0) {
            System.out.println("No real roots");
        } 
        else if (D == 0) {
            double x = -b / (2*a);
            System.out.println("One real root: x = " + x);
        } 
        else {
            double sqrtD = Math.sqrt(D); 
            double x1 = (-b + sqrtD) / (2*a);
            double x2 = (-b - sqrtD) / (2*a);
            System.out.println("Two real roots: x1 = " + x1 + ", x2 = " + x2);
        }

        sc.close();
    }
}