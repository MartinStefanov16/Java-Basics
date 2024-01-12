package L08_WhileCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double change = Double.parseDouble(scanner.nextLine());

        double cents = Math.round(change * 100);
        int coins = 0;


        while (cents > 0) {

            if (cents >= 200) {
                cents -= 200;
                coins++;
            } else if (cents >= 100) {
                cents -= 100;
                coins++;

            } else if (cents >= 50) {
                cents -= 50;
                coins++;

            } else if (cents >= 20) {
                cents -= 20;
                coins++;

            } else if (cents >= 10) {
                cents -= 10;
                coins++;

            } else if (cents >= 5) {
                cents -= 5;
                coins++;

            } else if (cents >= 2) {
                cents -= 2;
                coins++;

            } else {
                cents -= 1;
                coins++;

            }

        }

        System.out.println(coins);


    }
}
