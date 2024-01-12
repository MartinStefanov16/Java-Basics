package forLoopExtra;

import java.util.Scanner;

import static java.lang.System.in;

public class backToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double inheritence = Double.parseDouble(scanner.nextLine());
        int yearToLiveTo = Integer.parseInt(scanner.nextLine());

        double moneyLeft = inheritence;
        int currentAge = 18;


        for (int i = 1800; i <= yearToLiveTo; i++) {

            if (i % 2 == 0) {
                moneyLeft -= 12000;
            } else {
                moneyLeft -= 12000 + 50 * currentAge;
            }
            currentAge++;

        }



        if (moneyLeft >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyLeft);
        } else {
           System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyLeft));
        }
    }
}
