package L10_NestedLoops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class try3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int currentNum = firstNum; currentNum <= secondNum; currentNum++) {
            String i = Integer.toString(currentNum);

            int evenSum = 0;
            int oddSum = 0;

            for (int position = 0; position < i.length(); position++) {
                int currentDigit = Integer.parseInt(String.valueOf(i.charAt(position)));

                if (position % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }


            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }


        }
    }
}
