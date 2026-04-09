package problem6;

import java.util.*;

public class TestProblem6 {
    public static void main(String[] args) {

        // EMPLOYEE TEST 
        Employee e1 = new Employee("Alice", 0, 5000);
        Employee e2 = new Employee("Bob", 0, 7000);

        System.out.println("=== Employee ===");
        System.out.println(e1);
        System.out.println("Payment: " + e1.getPaymentAmount());
        System.out.println("Compare: " + e1.compareTo(e2));

        Employee clone = e1.clone();
        System.out.println("Clone: " + clone);

        //  DOG TEST
        Dog d1 = new Dog("Rex", 2);
        Dog d2 = new Dog("Max", 5);

        System.out.println("\n=== Dog ===");
        System.out.println(d1);

        d1.train();

        System.out.println("Compare dogs: " + d1.compareTo(d2));

        // SORT TEST
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        Collections.sort(list);

        System.out.println("\nSorted Employees:");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}