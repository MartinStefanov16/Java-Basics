package L03_SwitchCases;

import java.util.Scanner;

import static java.lang.System.in;

public class weekendOrWorkDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String day = scanner.nextLine();


        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
