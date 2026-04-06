package problem5;

import java.util.Arrays;
import problem4.Employee;

public class SortTest {
    public static void main(String[] args) {

        //  Chocolate test
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Snickers", 70),
                new Chocolate("Mars", 60)
        };

        Sort.bubbleSort(chocolates);
        System.out.println("Chocolates sorted:");
        System.out.println(Arrays.toString(chocolates));
         // 🔹 Time test
        Time[] times = {
                new Time(10, 30, 0),
                new Time(9, 45, 0),
                new Time(10, 15, 0)
        };

        Sort.mergeSort(times);
        System.out.println("\nTimes sorted:");
        System.out.println(Arrays.toString(times));
        // 🔹 Employee test
        Employee[] employees = {
                new Employee("A", 5000, new java.util.Date(), "1"),
                new Employee("B", 3000, new java.util.Date(), "2"),
                new Employee("C", 7000, new java.util.Date(), "3")
        };

        Sort.bubbleSort(employees);
        System.out.println("\nEmployees sorted:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}