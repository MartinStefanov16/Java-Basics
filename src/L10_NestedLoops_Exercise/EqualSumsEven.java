package L10_NestedLoops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class EqualSumsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());



        for (int curentNumber = numberOne; curentNumber <= numberTwo; curentNumber++) {
            String textNumber = Integer.toString(curentNumber);
            int sumEvenPosition = 0;
            int sumOddPosition = 0;

            for (int position = 0; position < textNumber.length(); position++) {
                int currentDigit =  Integer.parseInt(String.valueOf(textNumber.charAt(position)));

                if (position % 2 == 0) {
                    sumEvenPosition+= currentDigit;
                } else {
                    sumOddPosition+= currentDigit;
                }



            }

            if (sumEvenPosition == sumOddPosition) {
                System.out.print(textNumber + " ");
            }

        }

    }
}
