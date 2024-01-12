package L02_IfElseChecks_Exercise;

import java.util.Scanner;

public class monke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double clothesExpense = people * clothesPrice;

        if (people > 150) {
            clothesExpense = clothesExpense - (clothesExpense * 0.10);
        }


        double decorPrice = budget * 0.10;
        double totalPrice =  clothesExpense + decorPrice;


        if (totalPrice <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPrice);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - budget);
        }






    }
}
