package L02_IfElseChecks_Exercise;

import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String showName = scanner.nextLine();
        double episodeLenght = Double.parseDouble(scanner.nextLine());
        double lunchBreak = Double.parseDouble(scanner.nextLine());

        double faseA = lunchBreak / 8;
        double faseB = lunchBreak / 4;
        double freeTime = lunchBreak - faseA - faseB;


        if (freeTime >= episodeLenght) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", showName, Math.ceil(freeTime - episodeLenght));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", showName, Math.ceil (episodeLenght - freeTime));
        }


    }
}
