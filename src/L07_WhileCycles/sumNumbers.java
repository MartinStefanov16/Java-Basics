package L07_WhileCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < n) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }

        System.out.println(sum);
    }
}
