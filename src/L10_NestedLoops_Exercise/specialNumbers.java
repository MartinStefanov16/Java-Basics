package L10_NestedLoops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1111; currentNumber <= 9999; currentNumber++) {
            String firstStep = String.valueOf(currentNumber);

            int validDigits = 0;

            for (int position = 0; position <= 3; position++) {
                int currentDigit = Integer.parseInt(String.valueOf(firstStep.charAt(position))); // this is understood more easy by reading right to left, you go trough firstStep then secondStep etc

                if (currentDigit == 0) {
                    break;
                }

                if (n % currentDigit == 0) {
                    validDigits++;
                } else {
                    continue;
                }

            }

            if (validDigits == 4) {
                System.out.print(currentNumber + " ");
            }



        }
    }
}
