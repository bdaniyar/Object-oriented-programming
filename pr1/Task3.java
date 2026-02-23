import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        double num = sc.nextDouble();

        if (num < 0 || num > 100) {
            System.out.println("Error: mark must be between 0 and 100.");
        } else if (num >= 94.5) {
            System.out.println("A");
        } else if (num >= 89.5) {
            System.out.println("A-");
        } else if (num >= 84.5) {
            System.out.println("B+");
        } else if (num >= 79.5) {
            System.out.println("B");
        } else if (num >= 74.5) {
            System.out.println("B-");
        } else if (num >= 69.5) {
            System.out.println("C+");
        } else if (num >= 64.5) {
            System.out.println("C");
        } else if (num >= 59.5) {
            System.out.println("C-");
        } else if (num >= 54.5) {
            System.out.println("D+");
        } else if (num >= 49.5) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}