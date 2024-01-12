package L10_NestedLoops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class sumSimpNumbersOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;


        while (!input.equals("stop")) {

            int currentNum = Integer.parseInt(input);

            if (currentNum < 0) {
                System.out.println("Number is negative.");
                continue;
            } else if (currentNum == 0){
                input = scanner.nextLine();
                continue;
            } else if (currentNum == 1) {
                sumPrime++;
            }

            for (int i = 2; i < currentNum; i++) {

                if (currentNum % i > 0) {
                    sumNonPrime += currentNum;
                    break;
                } else {
                    sumPrime += currentNum;
                }

            }
            input = scanner.nextLine();



        }

        System.out.println(sumPrime);
        System.out.println(sumNonPrime);


    }
}
