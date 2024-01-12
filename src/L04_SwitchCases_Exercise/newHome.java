package L04_SwitchCases_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class newHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String flowerType = scanner.nextLine();;
        int flowerAmount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double flowerPrice = 0;

        switch (flowerType) {
            case "Roses":
                flowerPrice = flowerAmount * 5;

                if (flowerAmount > 80) {
                    flowerPrice = flowerPrice - (flowerPrice * 0.10);
                }

                break;
            case "Dahlias":
                flowerPrice = flowerAmount * 3.80;
                if (flowerAmount > 90) {
                    flowerPrice = flowerPrice - (flowerPrice * 0.15);
                }
                break;
            case "Tulips":
                flowerPrice = flowerAmount * 2.80;
                if (flowerAmount > 80) {
                    flowerPrice = flowerPrice - (flowerPrice * 0.15);
                }
                break;
            case "Narcissus":
                flowerPrice = flowerAmount * 3;
                if (flowerAmount < 120) {
                    flowerPrice = flowerPrice + (flowerPrice * 0.15);
                }
                break;
            case "Gladiolus":
                flowerPrice = flowerAmount * 2.50;
                if (flowerAmount < 80) {
                    flowerPrice = flowerPrice + (flowerPrice * 0.20);
                }
                break;
        }

        if (budget >= flowerPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerAmount, flowerType, budget - flowerPrice);
        } else
            System.out.printf("Not enough money, you need %.2f leva more.", flowerPrice - budget);

    }
}
