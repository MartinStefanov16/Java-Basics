package L02_IfElseChecks_Exercise;

import java.util.Scanner;

public class shoppingPc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        // video 250lv
        // cpu 30% ot total video price per unit
        // ram 10% ot total video price per unit

        double videoPrice =  video * 250;
        double cpuPrice = (videoPrice * 0.35) * cpu;
        double ramPrice = (videoPrice * 0.10) * ram;

        double totalPrice = videoPrice + ramPrice + cpuPrice;

        if (video > cpu) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }


        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }








    }
}
