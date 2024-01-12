package L03_SwitchCases;

import java.util.Scanner;

public class workingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        boolean isWorkDay =  day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday");


        boolean isWorkTime = time >= 10 && time <= 18;

        if (isWorkDay && isWorkTime) {
            System.out.println("open");
        } else
            System.out.println("closed");

    }
}
