package L06_ForCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judgeCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < judgeCount; i++) {
            String judgeName = scanner.nextLine();
            double pointsGiven = Double.parseDouble(scanner.nextLine());

            points += judgeName.length() * pointsGiven / 2;

            if (points > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points );
                return;
            }

        }

        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!",actorName, 1250.5 - points );
        }


    }
}
