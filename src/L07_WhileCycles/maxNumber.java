package L07_WhileCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int n = Integer.parseInt(input);

            if (n > maxNumber) {
                maxNumber = n;
            }

            input = scanner.nextLine();
        }

        System.out.println(maxNumber);
    }
}
