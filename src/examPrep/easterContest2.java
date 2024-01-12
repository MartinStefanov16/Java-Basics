package examPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class easterContest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int breadAmount = Integer.parseInt(scanner.nextLine());


        int bestScore = Integer.MIN_VALUE;
        String bestBakerName = "";

        for (int i = 1; i <= breadAmount; i++) {
            String bakerName = scanner.nextLine();

            String input = scanner.nextLine();

            int currentBakerScore = 0;

            while (!input.equals("Stop")) {
                int score = Integer.parseInt(input);

                currentBakerScore += score;

                if (currentBakerScore > bestScore) {
                    bestScore = currentBakerScore;
                    bestBakerName = bakerName;
                }


                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.\n", bakerName, currentBakerScore);
            if (currentBakerScore > bestScore) {
                System.out.printf("%s is the new number 1!\n", bakerName);
            }


        }

        System.out.printf("%s won competition with %d points!", bestBakerName, bestScore);

    }
}
