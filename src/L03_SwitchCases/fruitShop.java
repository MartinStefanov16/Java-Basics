package L03_SwitchCases;

import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (day.equals("Monday") || (day.equals("Tuesday")) || (day.equals("Wednesday")) || (day.equals("Thursday") || (day.equals("Friday")))) {
            if (fruit.equals("banana"))
                price = 2.50;
            if (fruit.equals("apple"))
                price = 1.20;
            if (fruit.equals("orange"))
                price = 0.85;
            if (fruit.equals("grapefruit"))
                price = 1.45;
            if (fruit.equals("kiwi"))
                price = 2.70;
            if (fruit.equals("pineapple"))
                price = 5.50;
            if (fruit.equals("grapes"))
                price = 3.85;
        } else if (day.equals("Saturday") || (day.equals("Sunday"))) {
            if (fruit.equals("banana"))
                price = 2.70;
            if (fruit.equals("apple"))
                price = 1.25;
            if (fruit.equals("orange"))
                price = 0.90;
            if (fruit.equals("grapefruit"))
                price = 1.60;
            if (fruit.equals("kiwi"))
                price = 3.00;
            if (fruit.equals("pineapple"))
                price = 5.60;
            if (fruit.equals("grapes"))
                price = 4.20;
        }

        if (price > 0) {
            System.out.printf("%.2f", price * amount);
        } else {
            System.out.println("error");
        }
    }
}
