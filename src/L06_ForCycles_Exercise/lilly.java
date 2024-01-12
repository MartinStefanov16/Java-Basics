package L06_ForCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class lilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double birthdayMoney = 10.00;
        double lilyMoney = 0;
        int toys = 0;


        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0){
                lilyMoney += birthdayMoney;
                birthdayMoney += 10.00;
                lilyMoney -= 1;
            } else {
                toys++;
            }

        }

        lilyMoney += toys * toyPrice;

        if (lilyMoney >= washerPrice) {
            System.out.printf("Yes! %.2f", lilyMoney - washerPrice );
        } else {
            System.out.printf("No! %.2f", washerPrice - lilyMoney );
        }

    }
}
