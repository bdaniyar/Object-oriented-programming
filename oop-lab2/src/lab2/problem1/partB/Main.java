package lab2.problem1.partB;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(
                "Clean Code",
                "Robert Martin",
                2008,
                464
        );

        Book book2 = new Book(
                "Effective Java",
                "Joshua Bloch",
                2018,
                412
        );

        System.out.println(book1);
        System.out.println(book2);

    }
}