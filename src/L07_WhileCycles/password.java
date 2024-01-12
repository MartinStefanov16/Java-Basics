package L07_WhileCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals(pass)) {
            input = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", name);
    }
}
