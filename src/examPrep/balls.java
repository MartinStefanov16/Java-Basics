package examPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        int points = 0;

        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int other = 0;
        int devides = 0;

        for (int i = 1; i <= n; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    points += 5;
                    red++;
                break;
                case "orange":
                    points += 10;
                    orange++;
                    break;
                case "yellow":
                    points += 15;
                    yellow++;
                    break;
                case "white":
                    points += 20;
                    white++;
                    break;
                case "black":
                    points = points / 2;
                    devides++;
                    break;
                default:
                    other++;
            }

        }
        System.out.printf("Total points: %d\n", points);
        System.out.printf("Red balls: %d\n", red);
        System.out.printf("Orange balls: %d\n", orange);
        System.out.printf("Yellow balls: %d\n", yellow);
        System.out.printf("White balls: %d\n", white);
        System.out.printf("Other colors picked: %d\n", other);
        System.out.printf("Divides from black balls: %d\n", devides);









    }
}
