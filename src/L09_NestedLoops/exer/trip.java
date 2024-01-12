package L09_NestedLoops.exer;

import java.util.Scanner;

import static java.lang.System.in;

public class trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        String destination = scanner.nextLine();

        int moneySaved = 0;

        while (!destination.equals("End")) {
            double tripCost = Double.parseDouble(scanner.nextLine());
            double addedMoney = Double.parseDouble(scanner.nextLine());

            while (moneySaved <= tripCost) {

                moneySaved += addedMoney;

                if (moneySaved >= tripCost) {
                    System.out.printf("Going to %s!\n", destination);
                    moneySaved = 0;
                    break;
                }
                addedMoney = Double.parseDouble(scanner.nextLine());
            }









            destination = scanner.nextLine();
        }

    }
}
