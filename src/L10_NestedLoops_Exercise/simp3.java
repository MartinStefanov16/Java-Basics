package L10_NestedLoops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class simp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;

        boolean isNonPrime = false;

        while (!input.equals("stop")) {

            int currentNum = Integer.parseInt(input);

            if (currentNum < 0) {
                System.out.println("Number is negative.");
            } else {

                for (int i = 2; i <= currentNum - 1; i++) {

                    if (currentNum % i == 0) {
                        isNonPrime = true;
                        break;
                    }
                }


                if (isNonPrime) {
                    sumNonPrime += currentNum;
                    isNonPrime = false;
                } else {
                    sumPrime += currentNum;
                }


            }
            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);



    }
}
