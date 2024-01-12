package L08_WhileCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class examPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int tasksAllowedToFail = Integer.parseInt(scanner.nextLine());

        String taskName = scanner.nextLine();

        int tasksSolved = 0;
        int totalScore = 0;
        int failedTasks = 0;
        boolean failedState = false;
        String lastTask = "";

        while (!taskName.equals("Enough")) {
            int taskScore = Integer.parseInt(scanner.nextLine());

            if (taskScore <= 4) {
                failedTasks++;
                if (failedTasks == tasksAllowedToFail) {
                    failedState = true;
                    break;
                }
            }

            tasksSolved++;
            totalScore += taskScore;
            lastTask = taskName;

            taskName = scanner.nextLine();

        }

        if (failedState) {
            System.out.printf("You need a break, %d poor grades.", failedTasks);
        } else {
            System.out.printf("Average score: %.2f\n", totalScore * 1.0 / tasksSolved );
            System.out.printf("Number of problems: %d\n", tasksSolved);
            System.out.printf("Last problem: %s", lastTask);
        }


    }
}
