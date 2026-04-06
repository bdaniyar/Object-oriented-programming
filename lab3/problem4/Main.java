package problem4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 🔹 Создание сотрудников
        Employee e1 = new Employee("Alice", 5000, new Date(), "123");
        Employee e2 = new Employee("Bob", 7000, new Date(), "456");

        // 🔹 Создание менеджера
        Manager m1 = new Manager("John", 7000, new Date(), "789", 2000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);

        // 🔹 equals
        System.out.println("\nEQUALS TEST");
        Employee e3 = new Employee("Alice", 5000, new Date(), "123");
        System.out.println("e1 equals e3: " + e1.equals(e3));

        // 🔹 Comparable
        System.out.println("\n COMPARABLE TEST (salary)");
        System.out.println("e1 vs e2: " + e1.compareTo(e2)); // -1 ожидаемо

        // 🔹 Comparator (name)
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        System.out.println("\nSORT BY NAME");
        Collections.sort(list, new NameComparator());
        for (Employee e : list) {
            System.out.println(e);
        }

        // 🔹 Comparator (date)
        System.out.println("\nSORT BY HIRE DATE");
        Collections.sort(list, new HireDateComparator());
        for (Employee e : list) {
            System.out.println(e);
        }

        // 🔹 Clone Employee
        System.out.println("\nCLONE EMPLOYEE (shallow)");
        Employee eClone = e1.clone();
        System.out.println("Original: " + e1);
        System.out.println("Clone:    " + eClone);

        // 🔹 Clone Manager (DEEP)
        System.out.println("\nCLONE MANAGER (deep)");
        Manager mClone = m1.clone();

        System.out.println("Original manager: " + m1);
        System.out.println("Cloned manager:  " + mClone);

        // 🔥 Проверка deep clone
        mClone.addEmployee(new Employee("NEW", 1000, new Date(), "999"));

        System.out.println("\nAfter modifying clone:");
        System.out.println("Original team size: " + m1.getTeamSize());
        System.out.println("Cloned team size:  " + mClone.getTeamSize());
    }
}