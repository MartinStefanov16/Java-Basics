package L09_NestedLoops.exer;

import java.util.Scanner;

import static java.lang.System.in;

public class sumOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int start =  Integer.parseInt(scanner.nextLine());
        int end =  Integer.parseInt(scanner.nextLine());
        int magicNumber =  Integer.parseInt(scanner.nextLine());

        int numberOfCombinations = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                int result = i + j;
                numberOfCombinations++;

                if (result == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", numberOfCombinations, i, j, magicNumber);
                    return;
                }

            }

        }

                System.out.printf("%d combinations - neither equals %d", numberOfCombinations, magicNumber );
    }
}
