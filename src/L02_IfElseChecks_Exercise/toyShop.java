package L02_IfElseChecks_Exercise;

import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double orderPrice = (puzzle * 2.60) + (doll * 3.00) + (bear * 4.10) + (minion * 8.20) + (truck * 2.00);
        int toysCount = puzzle + doll + bear + minion + truck;

        if (toysCount >= 50) {
            orderPrice = orderPrice - (orderPrice * 0.25);
        }

        orderPrice = orderPrice - (orderPrice * 0.10);

        if (orderPrice >= tripPrice) {
            //double moneyLeft = orderPrice - tripPrice;
            System.out.printf("Yes! %.2f lv left.", orderPrice - tripPrice);
        } else {
            //double moneyNeeded = tripPrice - orderPrice;
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - orderPrice);
        }

    }
}
