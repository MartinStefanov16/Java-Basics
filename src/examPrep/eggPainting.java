package examPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class eggPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int numOfRuns = Integer.parseInt(scanner.nextLine());

        int pricePerRun = 0;

        switch(size) {
            case "Large":

                switch (color) {
                    case "Red":
                    pricePerRun = 16;
                    break;
                    case "Green":
                        pricePerRun = 12;
                        break;
                    case "Yellow":
                        pricePerRun = 9;
                        break;

                }

                break;
            case "Medium":

                switch (color) {
                    case "Red":
                        pricePerRun = 13;
                        break;
                    case "Green":
                        pricePerRun = 9;
                        break;
                    case "Yellow":
                        pricePerRun = 7;
                        break;

                }

                break;
            case "Small":

                switch (color) {
                    case "Red":
                        pricePerRun = 9;
                        break;
                    case "Green":
                        pricePerRun = 8;
                        break;
                    case "Yellow":
                        pricePerRun = 5;
                        break;

                }

                break;
        }

        double price = numOfRuns * pricePerRun;
        double priceWithCosts = price - (price * 0.35);

        System.out.printf("%.2f leva.", priceWithCosts);



    }
}
