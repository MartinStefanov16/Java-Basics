package L08_WhileCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int apartmentWide = Integer.parseInt(scanner.nextLine());
        int apartmentLong = Integer.parseInt(scanner.nextLine());
        int apartmentHigh = Integer.parseInt(scanner.nextLine());

        int apartmentVolume = apartmentWide * apartmentLong * apartmentHigh;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);

            apartmentVolume -= boxes;

            if (apartmentVolume < 0 ) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(apartmentVolume));
                return;
            }


            input = scanner.nextLine();
        }

        System.out.printf("%d Cubic meters left.", apartmentVolume);

    }
}
