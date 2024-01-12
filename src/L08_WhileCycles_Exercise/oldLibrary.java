package L08_WhileCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class oldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String desiredBook = scanner.nextLine();
        String currentBook = scanner.nextLine();

        int bookesChecked = 0;

        // get keyword - console
        // compare books -

        while (!desiredBook.equals(currentBook)) {


            switch (currentBook) {
                case "No More Books":
                    System.out.println("The book you search is not here!");
                    System.out.printf("You checked %d books.", bookesChecked);
                return;
            }

            bookesChecked++;

            currentBook = scanner.nextLine();

        }

        System.out.printf("You checked %d books and found it.", bookesChecked);


    }
}
