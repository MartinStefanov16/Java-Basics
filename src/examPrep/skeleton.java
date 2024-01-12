package examPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int quotaMins = Integer.parseInt(scanner.nextLine());
        int quotaSec = Integer.parseInt(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        int hundredMeterSpeed = Integer.parseInt(scanner.nextLine());

        int quotaRealMins = (quotaMins * 60) + quotaSec;

        double slowDown = lenght / 120;
        double slowDownSec = slowDown * 2.5;

        double meterSec = 100 / (hundredMeterSpeed * 1.00);
        double time = (lenght / meterSec) - slowDownSec;


        if (time <= quotaRealMins) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", time);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",time - quotaRealMins );
        }


    }
}
