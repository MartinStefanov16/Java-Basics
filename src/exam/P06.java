package exam;

import java.util.Scanner;

import static java.lang.System.in;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = Integer.parseInt(scanner.nextLine());

        String firstStep = String.valueOf(number);

        int numberOne = Integer.parseInt(String.valueOf(firstStep.charAt(2)));
        int numberTwo = Integer.parseInt(String.valueOf(firstStep.charAt(1)));
        int numberThree = Integer.parseInt(String.valueOf(firstStep.charAt(0)));

        for (int i = 1; i <= numberOne; i++) {
            for (int j = 1; j <= numberTwo; j++) {
                for (int k = 1; k <= numberThree; k++) {
                    int result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;\n",i,j,k,result );

                }

            }

        }


    }
}
