package L04_SwitchCases_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String location = "";
        double cost = 0;

        if (budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                cost = budget * 0.30;
                location = "Camp";
            } else if (season.equals("winter")) {
                cost = budget * 0.70;
                location = "Hotel";
            }

        } else if (budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                cost = budget * 0.40;
                location = "Camp";
            } else if (season.equals("winter")) {
                cost = budget * 0.80;
                location = "Hotel";
            }

        } else {
            destination = "Europe";
            cost = budget * 0.90;
            location = "Hotel";

        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", location, cost);
    }
}
