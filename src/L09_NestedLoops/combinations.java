package L09_NestedLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int combinations = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int x = 0; x <= n; x++) {
            for (int y = 0; y <= n; y++) {
                for (int z = 0; z <= n; z++) {
                    int result = x + y + z;

                    if (result == n) {
                        combinations++;
                    }

                }

            }

        }
        System.out.println(combinations);


    }
}
