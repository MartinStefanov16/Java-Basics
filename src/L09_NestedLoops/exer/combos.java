package L09_NestedLoops.exer;

import java.util.Scanner;

import static java.lang.System.in;

public class combos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        int solutions = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    int result = i + j + k;

                    if (result == n) {
                        solutions++;
                    }

                }

            }

        }

        System.out.println(solutions);
    }
}
