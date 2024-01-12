package L02_IfElseChecks_Exercise;

import java.util.Scanner;

public class swimmingRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timSecondPerMeter = Double.parseDouble(scanner.nextLine());

        double ivanTimeNoResist = distanceMeters * timSecondPerMeter;
        double slow = Math.floor (distanceMeters / 15 );
        double ivanTimeTotal = ivanTimeNoResist + (slow * 12.5);

        if (ivanTimeTotal < worldRecordSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTimeTotal);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivanTimeTotal - worldRecordSeconds);
        }

    }
}
