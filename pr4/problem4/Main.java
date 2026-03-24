package problem4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Daniyar", 3.4));
        list.add(new Student("Alex", 3.8));
        list.add(new Student("Bob", 2.9));

        System.out.println("Sort by GPA:");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("-----");

        System.out.println("Sort by Name:");
        Collections.sort(list, new NameComparator());
        System.out.println(list);
    }
}
