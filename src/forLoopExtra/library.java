package forLoopExtra;

import java.util.Scanner;

import static java.lang.System.in;

public class library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String desiredBook = scanner.nextLine();
        String input = scanner.nextLine();

        int bookesChecked = 0;

        // we find the book
        // we say No More Books
        while (!input.equals("No More Books")) {

            if (input.equals(desiredBook)) {
                System.out.println("found");
                System.out.println(bookesChecked);
                return;
            }

            bookesChecked++;


            input = scanner.nextLine();
        }
        System.out.println("not here");
        System.out.println(bookesChecked);


    }
}
