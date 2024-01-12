package L05_ForCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class evenPowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i <= 0; i++) {
            System.out.println(Math.pow(2, i));
        }

    }
}
