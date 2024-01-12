package L04_SwitchCases_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = (examHour * 60) + examMinute;
        int arrivalTotalMinutes = (arrivalHour * 60) + arrivalMinute;
        int diff = Math.abs(examTotalMinutes - arrivalTotalMinutes);


        if (arrivalTotalMinutes > examTotalMinutes) {
            System.out.println("Late");

            if (diff < 60) {
                System.out.printf("%d minutes after the start",diff % 60);
            } else {
                System.out.printf("%d:%02d hours after the start",diff / 60, diff % 60 );
            }


        } else if (arrivalTotalMinutes == examTotalMinutes || arrivalTotalMinutes >= (examTotalMinutes - 30)) {
            System.out.println("On time");

            if (diff >= 1) {
                System.out.printf("%d minutes before the start",diff % 60);
            }

        } else if (arrivalTotalMinutes < (examTotalMinutes + 30)) {
            System.out.println("Early");

            if (diff < 60) {
                System.out.printf("%d minutes before the start",diff % 60);
            } else {
                System.out.printf("%d:%02d hours before the start",diff / 60, diff % 60 );
            }


        }












    }
}
