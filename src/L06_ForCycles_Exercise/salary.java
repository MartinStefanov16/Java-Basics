package L06_ForCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int penalty = 0;

        for (int i = 1; i <= openTabs; i++) {
            String siteName = scanner.nextLine();

            switch (siteName) {
                case "Facebook":
                    penalty += 150;
                    break;
                case "Instagram":
                    penalty += 100;
                    break;
                case "Reddit":
                    penalty += 50;
                    break;
            }

            if (penalty >= salary) {
                System.out.println("You have lost your salary.");
                return;
            }

        }

        System.out.print(salary - penalty);






    }
}
