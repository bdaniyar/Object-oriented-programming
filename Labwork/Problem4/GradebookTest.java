package Labwork.Problem4;

import java.util.Scanner;
import pr2.Student;

public class GradebookTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course course = new Course(
                "CS101",
                "Object-Oriented Programming",
                5,
                new java.util.ArrayList<>());

        Gradebook gb = new Gradebook(course);

        int n = readInt(sc, "How many students? ", 1, 200);

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine().trim();

            int id = readInt(sc, "ID: ", 1, 1_000_000);

            // (name, id)
            Student s = new Student(name, id);
            gb.addStudent(s);

            int grade = readInt(sc, "Grade (0-100): ", 0, 100);
            gb.setGrade(i, grade);
        }

        System.out.println();
        gb.displayGradeReport();

        sc.close();
    }

    private static int readInt(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            try {
                int x = Integer.parseInt(input);
                if (x < min || x > max) {
                    System.out.println("Enter a value between " + min + " and " + max);
                    continue;
                }
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }
}