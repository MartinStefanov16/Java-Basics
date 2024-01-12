package examPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class catWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int numberOfWalks = Integer.parseInt(scanner.nextLine());
        int dailyCalorieIntake = Integer.parseInt(scanner.nextLine());

        int totalMinsWalked = minutesWalk * numberOfWalks;
         int caloriesBurned =  totalMinsWalked * 5;
         double caloryBurnQuota = dailyCalorieIntake * 0.50;

         if (caloriesBurned >= caloryBurnQuota) {
             System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesBurned );
         } else {
             System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurned);
         }









    }
}
