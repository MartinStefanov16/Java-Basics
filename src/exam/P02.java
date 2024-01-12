package exam;

import java.util.Scanner;

import static java.lang.System.in;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double dailyAllowence = Double.parseDouble(scanner.nextLine());
        double dailySalesProfit = Double.parseDouble(scanner.nextLine());
        double allExpenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double allowenceProfit = dailyAllowence * 5;
        double profitPerDay = dailySalesProfit * 5;

        double profit = allowenceProfit + profitPerDay;

        double moneySaved = profit - allExpenses;

        if (moneySaved >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", moneySaved);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - moneySaved);
        }


    }

}
