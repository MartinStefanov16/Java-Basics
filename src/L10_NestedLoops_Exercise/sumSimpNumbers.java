package L10_NestedLoops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class sumSimpNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;


        while (!input.equals("stop")) {

            int currentNum = Integer.parseInt(input);

            if (currentNum < 0) {
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = true;


                for (int i = 2; i <= currentNum - 1; i++) {

                    if (currentNum % i == 0) {
                        isPrime = false;
                        break;
                    }

                }
                if (isPrime) {
                    sumPrime += currentNum;
                } else {
                    sumNonPrime += currentNum;
                }


            }



            input = scanner.nextLine();



        }

        System.out.println(sumPrime);
        System.out.println(sumNonPrime);


    }
}
