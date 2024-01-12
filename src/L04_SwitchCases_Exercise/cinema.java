package L04_SwitchCases_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int collum = Integer.parseInt(scanner.nextLine());

        double seats = row * collum;
        double price = 0;

        switch (type) {
            case "Premiere":
                price = 12.00;
            break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5.00;
                break;
        }

        System.out.printf("%.2f leva", seats * price);

    }
}
