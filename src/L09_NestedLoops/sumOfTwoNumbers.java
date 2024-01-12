package L09_NestedLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinations = 0;
        boolean isComboFound = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinations++;
                int result =  i + j;

                if (result == magicNumber) {
                    isComboFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinations, i, j, magicNumber );
                    break;
                }



            }
            if (isComboFound) {
                break;
            }


        }

        if (!isComboFound) {
            System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
        }







    }
}
