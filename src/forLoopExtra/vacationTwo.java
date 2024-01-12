package forLoopExtra;

import java.util.Scanner;

import static java.lang.System.in;

public class vacationTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());

        int consecutiveSpends = 0;
        //int dayspassed = 0;

        while (consecutiveSpends < 5) {

            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            //dayspassed++;

            switch (action) {
                case "spend":
                    moneyAvailable -= money;
                    consecutiveSpends++;

                    if (moneyAvailable < 0) {
                        moneyAvailable = 0;
                    }

                    break;
                case "save":
                    moneyAvailable += money;
                    consecutiveSpends = 0;
                    break;
            }

            if (moneyAvailable >= moneyNeeded) {
                System.out.println("money collected");
                return;
            }


        }

        System.out.println("failed to save");

    }
}
