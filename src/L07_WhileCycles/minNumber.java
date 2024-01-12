package L07_WhileCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class minNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        int lowNumber = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int n = Integer.parseInt(input);

            if (n < lowNumber) {
                lowNumber = n;
            }

            input = scanner.nextLine();

        }
        System.out.println(lowNumber);
    }
}
