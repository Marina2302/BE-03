package module01.finalTask;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalTask {
    static String[] books;
    static int count;

    static {
        books = new String[10];
        books[0] = "The Lord of the Rings";
        books[1] = "Harry Potter";
        books[2] = "We, the Gods";
        count = 2;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello! This is a library.\nIntroduce yourself please: ");
        String name = sc.nextLine();
        sayHello(name);

        int num = 0;
        while (num != 7) {
            showMenu();
            System.out.println("Enter action number: ");
            try {
                String s = sc.nextLine();
                num = Integer.parseInt(s);
                if (isValid(num)) {
                    action(num);
                } else {
                    throw new NumberFormatException();
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Make a choice from the proposed options!");
            }
        }
    }

    private static void sayHello(String name) {
        System.out.println("Nice to meet you, " + name + "!");
    }

    private static void showMenu() {
        System.out.println("Choose what you want to do:");
        System.out.println("1. Show all books.");
        System.out.println("2. Add book by title.");
        System.out.println("3. Edit the title of the book.");
        System.out.println("4. Delete book by title.");
        System.out.println("5. Check book availability by title.");
        System.out.println("6. Sort books by titles.");
        System.out.println("7. Exit the program.");
    }

    private static boolean isValid(int num) {
        if (num < 1 | num > 7) {
            return false;
        } else {
            return true;
        }
    }

    private static void action(int num) {
        switch (num) {
            case 1:
                show();
                break;
            case 2:
                add();
                break;
            case 3:
                edit();
                break;
            case 4:
                delete();
                break;
            case 5:
                check();
                break;
            case 6:
                sort();
                break;
            case 7:
                exit();
                break;
        }
    }

    private static void show() {
        if (count < 0) {
            System.out.println("The library is empty!");
        }
        for (int i = 0; i <= count; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
    }

    private static void add() {
        if (count < books.length - 1) {
            System.out.println("Enter the title of the book:");
            String nb = sc.nextLine();
            boolean isBookExists = false;
            for (int i = 0; i <= count; i++) {
                if (books[i].equals(nb)) {
                    System.out.println("This book already exists in the library!");
                    isBookExists = true;
                    break;
                }
            }
            if (!isBookExists) {
                books[++count] = nb;
                System.out.println("Book added successfully!");
            }
        } else {
            System.out.println("The library is full!");
        }
        System.out.println();
    }

    private static void edit() {
        System.out.println("Enter the title of the book to edit:");
        boolean isBookExists = false;
        String bookForEditing = sc.nextLine();
        for (int i = 0; i <= count; i++) {
            if (books[i].equals(bookForEditing)) {
                System.out.println("Enter a new title for the book:");
                String newTitle = sc.nextLine();
                books[i] = newTitle;
                isBookExists = true;
                System.out.println("The book successfully edited!");
                break;
            }
        }
        if (!isBookExists) {
            System.out.println("This book does not exist in the library!");
        }
        System.out.println();
    }

    private static void delete() {
        System.out.println("Enter the title of the book to delete:");
        boolean isBookExists = false;
        String bookForDeleting = sc.nextLine();
        for (int i = 0; i <= count; i++) {
            if (books[i].equals(bookForDeleting)) {
                for (int j = i; j < count + 1; j++) {
                    books[j] = books[j + 1];
                }
                isBookExists = true;
                count--;
                System.out.println("The book successfully deleted!");
                break;
            }
        }
        if (!isBookExists) {
            System.out.println("This book does not exist in the library!");
        }
        System.out.println();
    }

    private static void check() {
        System.out.println("Enter the title of the book to find it:");
        boolean isBookExists = false;
        String bookForCheck = sc.nextLine();
        for (int i = 0; i <= count; i++) {
            if (books[i].equalsIgnoreCase(bookForCheck)) {
                System.out.println("This book exists in the library!");
                isBookExists = true;
                break;
            }
        }
        if (!isBookExists) {
            System.out.println("This book does not exist in the library!");
        }
        System.out.println();
    }

    private static void sort() {
        String[] sortArray = new String[count + 1];
        for (int i = 0; i <= count; i++) {
            sortArray[i] = books[i];
        }
        Arrays.sort(sortArray);
        for (int i = 0; i <= count; i++) {
            books[i] = sortArray[i];
        }
        show();
    }

    private static void exit() {
        System.out.println("Goodbye!");
        sc.close();
    }
}
