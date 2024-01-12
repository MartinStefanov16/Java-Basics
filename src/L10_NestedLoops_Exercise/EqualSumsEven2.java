package L10_NestedLoops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class EqualSumsEven2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        //String firstStep = String.valueOf(firstNum);




        for (int i = firstNum; i <= secondNum; i++) {
            String textNumber = Integer.toString(i);

            int evenSum = 0;
            int oddSum = 0;

            for (int position = 0; position < textNumber.length(); position++) {
                int currentNumber = Integer.parseInt(String.valueOf(textNumber.charAt(position)));


                if (position % 2 == 0) {
                    evenSum += currentNumber;
                } else {
                    oddSum += currentNumber;
                }
            }

            if (evenSum == oddSum) {
                System.out.print(textNumber + " ");
            }

            
        }

    }
}
