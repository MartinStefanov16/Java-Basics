package examPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class puppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int food = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int foodGrams = food * 1000;


        while (!input.equals("Adopted")) {
            int foodEaten = Integer.parseInt(input);

            foodGrams -= foodEaten;

            input = scanner.nextLine();

        }

        if (foodGrams >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodGrams);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodGrams));
        }
    }
}
