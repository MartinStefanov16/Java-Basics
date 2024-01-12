package exam;

import java.util.Scanner;

import static java.lang.System.in;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        // money depds on
        // country <1
        // points
        // season
        // then money is removed based on table

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = scanner.nextLine();

        double moneyReward = 0;

        switch (location) {
            case "Bulgaria":
                moneyReward = points * dancers;

                switch (season) {
                    case "summer":
                        moneyReward = moneyReward - (moneyReward * 0.05);
                        break;
                    case "winter":
                        moneyReward = moneyReward - (moneyReward * 0.08);
                        break;
                }

                break;
            case "Abroad":
                moneyReward = points * dancers;
                moneyReward = moneyReward + (moneyReward * 0.50);

                switch (season) {
                    case "summer":
                        moneyReward = moneyReward - (moneyReward * 0.10);
                        break;
                    case "winter":
                        moneyReward = moneyReward - (moneyReward * 0.15);
                        break;
                }
                break;
        }


        double moneyGivenToCharity = moneyReward * 0.75;
        double totalMoneyReceived = moneyReward - moneyGivenToCharity;
        double moneyPerDancer = totalMoneyReceived / dancers;

        System.out.printf("Charity - %.2f\n", moneyGivenToCharity);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);







    }
}
