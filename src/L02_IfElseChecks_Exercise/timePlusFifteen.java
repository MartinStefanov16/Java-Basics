package L02_IfElseChecks_Exercise;

import java.util.Scanner;

public class timePlusFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int minuteNew = (hour * 60) + minute + 15;
        int hourTotal = minuteNew / 60;
        int minuteTotal = minuteNew % 60;

        if (hourTotal >= 24) {
            hourTotal = 0;
        }

        if (minuteTotal < 10) {
            System.out.printf("%d:0%d", hourTotal, minuteTotal);
        } else {
            System.out.printf("%d:%d", hourTotal, minuteTotal);
        }



    }
}
