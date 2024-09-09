package start;

import java.util.HashMap;
/*
public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add some students and their grades
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        // Retrieve and print Bob's grade
        int bobsGrade = studentGrades.get("Bob");
        System.out.println("Bob's grade: " + bobsGrade);

        // Add another student and their grade
        studentGrades.put("David", 95);

        // Print all student names and grades
        System.out.println("Student Grades:");
        for (String name : studentGrades.keySet()) {
            int grade = studentGrades.get(name);
            System.out.println(name + ": " + grade);
        }
    }
}*/

import java.util.HashMap;

public class LibraryCatalogExample {
    public static void main(String[] args) {
        // Create a HashMap to represent the library catalog
        HashMap<String, String> libraryCatalog = new HashMap<>();

        // Add books (ISBNs and corresponding shelf numbers) to the catalog
        libraryCatalog.put("978-0132350884", "Shelf 1");
        libraryCatalog.put("978-0201616224", "Shelf 2");
        libraryCatalog.put("978-0134685991", "Shelf 3");

        // Retrieve the shelf number for a specific book using its ISBN
        String shelfNumber = libraryCatalog.get("978-0201616224");
        System.out.println("The book with ISBN 978-0201616224 is on " + shelfNumber);

        // Add another book to the catalog
        libraryCatalog.put("978-0321356680", "Shelf 2");

        // Print the entire library catalog
        System.out.println("Library Catalog:");
        for (String isbn : libraryCatalog.keySet()) {
            String shelf = libraryCatalog.get(isbn);
            System.out.println("ISBN: " + isbn + ", Shelf: " + shelf);
        }
    }
}

