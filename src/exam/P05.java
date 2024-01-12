package exam;

import java.util.Scanner;

import static java.lang.System.in;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int goal = Integer.parseInt(scanner.nextLine());

        int profit = 0;
        boolean isGoalReached = false;

        String input = scanner.nextLine();

        while (!input.equals("closed")) {
            String service = scanner.nextLine();

            switch (input) {
                case "haircut":

                    switch (service) {
                        case "mens":
                            profit += 15;
                            break;
                        case "ladies":
                            profit += 20;
                            break;
                        case "kids":
                            profit += 10;
                            break;
                    }

                    break;
                case "color":

                    switch (service) {
                        case "touch up":
                            profit += 20;
                            break;
                        case "full color":
                            profit += 30;
                            break;

                    }

                    break;
            }





            if (profit >= goal) {
                isGoalReached = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (isGoalReached) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %dlv. more.\n", goal - profit);
        }

        System.out.printf("Earned money: %dlv.", profit);



    }
}
