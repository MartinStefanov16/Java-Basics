package L07_WhileCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class accountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        String input = scanner.nextLine();
        double sum = 0;
        double increase = 0;

        while (!input.equals("NoMoreMoney")) {
            increase = Double.parseDouble(input);

            if (increase < 0) {
                System.out.println("Invalid operation!");
                break;
            }


            System.out.printf("Increase: %.2f\n", increase);
            sum += increase;


            input = scanner.nextLine();


        }

        System.out.printf("Total: %.2f", sum);

    }
}
