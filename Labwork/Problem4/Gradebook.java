package Labwork.Problem4;

import java.util.ArrayList;
import pr2.Student;

public class Gradebook {

    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Integer> grades; // grades saved in the same order as students

    public Gradebook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
        grades.add(-1); // -1 means no grade assigned yet
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

    // required by lab
    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    // calculations
    public double determineClassAverage() {
        if (grades.isEmpty())
            return 0.0;

        int sum = 0;
        for (int g : grades)
            sum += g;
        return (double) sum / grades.size();
    }

    public int getBestIndex() {
        int best = 0;
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > grades.get(best))
                best = i;
        }
        return best;
    }

    public int getWorstIndex() {
        int worst = 0;
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) < grades.get(worst))
                worst = i;
        }
        return worst;
    }

    // statistics
    public void outputBarChart() {
        int[] freq = new int[11]; // 0..10

        for (int g : grades) {
            if (g == 100)
                freq[10]++;
            else
                freq[g / 10]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < 11; i++) {
            if (i == 10) {
                System.out.print("100:   ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            for (int k = 0; k < freq[i]; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void displayGradeReport() {
        displayMessage();
        System.out.printf("Class average is %.2f%n", determineClassAverage());

        int worst = getWorstIndex();
        int best = getBestIndex();

        System.out.println("Lowest grade is " + grades.get(worst) + " (" + students.get(worst) + ").");
        System.out.println("Highest grade is " + grades.get(best) + " (" + students.get(best) + ").");

        System.out.println();
        outputBarChart();
    }

    @Override
    public String toString() {
        return "Gradebook{course=" + course + ", students=" + students.size() + "}";
    }
}