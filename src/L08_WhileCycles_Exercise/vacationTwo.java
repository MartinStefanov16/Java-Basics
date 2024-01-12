package L08_WhileCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class vacationTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int consecutiveSpends = 0;
        boolean failed = false;
        int dayspassed = 0;

        while (availableMoney < tripPrice){
            dayspassed++;
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (action) {
                case "spend":
                    availableMoney -= money;
                    consecutiveSpends++;

                    if (availableMoney <= 0) {
                        availableMoney = 0;
                    }

                    break;
                case "save":
                    availableMoney += money;
                    consecutiveSpends = 0;
                    break;
            }

            if (consecutiveSpends == 5) {
                failed = true;
                break;
            }

        }

        if (failed) {
            System.out.println("You can't save the money.");
            System.out.println(dayspassed);
        } else {
            System.out.printf("You saved the money for %d days.", dayspassed);
        }


    }
}
