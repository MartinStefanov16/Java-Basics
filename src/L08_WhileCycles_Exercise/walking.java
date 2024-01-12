package L08_WhileCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);



        String input = scanner.nextLine();
        int goal = 10000;
        int totalSteps = 0;

        while (!input.equals("Going home")) {


            int steps = Integer.parseInt(input);
            totalSteps += steps;

            if (totalSteps >= goal) {
                break;
            }

            input = scanner.nextLine();
        }



        if (input.equals("Going home")) {
            int finalSteps = Integer.parseInt(scanner.nextLine());
            totalSteps += finalSteps;
        }

        if (totalSteps >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - totalSteps);
        }

    }
}
