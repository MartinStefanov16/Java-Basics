package L05_ForCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class numbersNOver3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i += 3) {
            System.out.println(i);
        }

    }
}
