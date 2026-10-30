package clg.dkte;

import java.util.Scanner;

public class Program {

    public static Scanner sc = new Scanner(System.in);

    public static int menuList() {
        System.out.println("\n0. Exit");
        System.out.println("1. Add Books");
        System.out.println("2. Find Book By Id");
        System.out.println("3. Find Books By Publish Year");
        System.out.println("4. Display All Books");
        System.out.print("Enter Choice : ");

        return sc.nextInt();
    }

    public static void main(String[] args) {

        Book[] books = new Book[2];

        int ch;

        while ((ch = menuList()) != 0) {

            switch (ch) {

            case 1:
                for (int i = 0; i < books.length; i++) {
                    books[i] = new Book();
                    books[i].acceptRecord();
                }
                break;

            case 2:
                System.out.print("Enter Book Id : ");
                int id = sc.nextInt();

                for (int i = 0; i < books.length; i++) {
                    if (books[i].getBookId() == id) {
                        books[i].display();
                    }
                }
                break;

            case 3:
                System.out.print("Enter Publish Year : ");
                int y = sc.nextInt();
                for (int i = 0; i < books.length; i++)
                if (books[i] != null && books[i].getYear() == y)
                {
                    books[i].display();
                }
                break;

            case 4:
                for (int i = 0; i < books.length; i++)
                {
                        books[i].display();
                                  }
                break;

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}