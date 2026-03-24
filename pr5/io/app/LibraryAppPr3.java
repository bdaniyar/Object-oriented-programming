package io.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import io.model.BookPr3;

public class LibraryAppPr3 {
    public static void main(String[] args) {

        ArrayList<BookPr3> library = new ArrayList<>();

        // LOAD from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("library.dat"))) {
            Object obj = ois.readObject();

            if (obj instanceof ArrayList<?> list && list.stream().allMatch(BookPr3.class::isInstance)) {
                library = new ArrayList<>();
                for (Object element : list) {
                    library.add((BookPr3) element);
                }
                System.out.println("Library loaded.");
            } else {
                System.out.println("Invalid library file format. Starting new library.");
            }

        } catch (Exception e) {
            System.out.println("No existing file. Starting new library.");
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nA - Add book");
            System.out.println("L - List books");
            System.out.println("Q - Quit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("A")) {
                System.out.print("Enter title: ");
                String title = scanner.nextLine();

                System.out.print("Enter author: ");
                String author = scanner.nextLine();

                library.add(new BookPr3(title, author));

            } else if (choice.equals("L")) {

                for (BookPr3 book : library) {
                    book.incrementVisit(); // увеличиваем счётчик
                    System.out.println(book);
                }

            } else if (choice.equals("Q")) {

                // SAVE to file
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
                    oos.writeObject(library);
                    System.out.println("Library saved.");

                } catch (IOException e) {
                    System.out.println("Error saving file.");
                }

                break;
            }
        }

        scanner.close();
    }
}
