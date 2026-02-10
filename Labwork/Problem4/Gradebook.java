package Labwork.Problem4;

import java.util.ArrayList;
import Lab2.Student;

public class Gradebook {

    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Integer> grades; // оценки храним тут

    public Gradebook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
        grades.add(-1); // пока не введена
    }

    public void setGrade(int index, int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be 0..100");
        }
        grades.set(index, grade);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    // ===== required by lab =====
    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    // ===== calculations =====
    public double determineClassAverage() {
        if (grades.isEmpty()) return 0.0;

        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.size();
    }

    public int getBestIndex() {
        int best = 0;
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > grades.get(best)) best = i;
        }
        return best;
    }

    public int getWorstIndex() {
        int worst = 0;
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) < grades.get(worst)) worst = i;
        }
        return worst;
    }

    // ===== statistics (bar chart like in example) =====
    public void outputBarChart() {
        int[] freq = new int[11]; // 0..10

        for (int g : grades) {
            if (g == 100) freq[10]++;
            else freq[g / 10]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < 11; i++) {
            if (i == 10) {
                System.out.print("100:   ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            for (int k = 0; k < freq[i]; k++) System.out.print("*");
            System.out.println();
        }
    }

    // optional: letter grades frequency (как просили)
    public void outputLetterStats() {
        int a=0,b=0,c=0,d=0,f=0;
        for (int g : grades) {
            if (g >= 90) a++;
            else if (g >= 80) b++;
            else if (g >= 70) c++;
            else if (g >= 60) d++;
            else f++;
        }
        System.out.println("Letter grade stats:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("F: " + f);
    }

    public void displayGradeReport() {
        displayMessage();
        System.out.printf("Class average is %.2f%n", determineClassAverage());

        int worst = getWorstIndex();
        int best = getBestIndex();

        System.out.println("Lowest grade is " + grades.get(worst) + " (" + students.get(worst) + ").");
        System.out.println("Highest grade is " + grades.get(best) + " (" + students.get(best) + ").");

        System.out.println();
        outputLetterStats();
        System.out.println();
        outputBarChart();
    }

    @Override
    public String toString() {
        return "Gradebook{course=" + course + ", students=" + students.size() + "}";
    }
}