package L09_NestedLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String destination = scanner.nextLine();

        double moneySaved = 0;

        while (!destination.equals("End")) {
            double cost = Double.parseDouble(scanner.nextLine());
            double moneyAdded = Double.parseDouble(scanner.nextLine());

            while (moneySaved <= cost) {
                moneySaved+= moneyAdded;


                if (moneySaved >= cost) {
                    System.out.printf("Going to %s!\n", destination);
                    moneySaved = 0;
                    break;
                }

                moneyAdded = Double.parseDouble(scanner.nextLine());

            }




            destination = scanner.nextLine();
        }
    }
}
