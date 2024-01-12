package L06_ForCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class tennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int tourCount = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());

        int timesWon = 0;
        double pointsWon = 0;

        for (int i = 0; i < tourCount; i++) {
            String state = scanner.nextLine();

            switch (state) {
                case "W":
                    pointsWon += 2000;
                    timesWon++;
                    break;
                case "F":
                    pointsWon += 1200;
                    break;
                case "SF":
                    pointsWon += 720;
                    break;
            }

        }

       double average = pointsWon  / tourCount;
       double percentWonTours = (timesWon * 1.0 / tourCount) * 100;


        System.out.printf("Final points: %.0f\n", points + pointsWon);
        System.out.printf("Average points: %.0f\n", Math.floor(average));
        System.out.printf("%.2f%%", percentWonTours);


    }
}
