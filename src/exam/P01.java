package exam;

import java.util.Scanner;

import static java.lang.System.in;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int people = Integer.parseInt(scanner.nextLine());
        int daysStay = Integer.parseInt(scanner.nextLine());
        int nOfCards = Integer.parseInt(scanner.nextLine());
        int nOfMuseum = Integer.parseInt(scanner.nextLine());


        double stayCost = daysStay * 20;
        double cardsCost = nOfCards * 1.60;
        double museumCost = nOfMuseum * 6;

        double firstTotal = (stayCost + cardsCost + museumCost) * people;
        double finalCost = firstTotal + (firstTotal * 0.25);


        System.out.printf("%.2f", finalCost);



    }
}
