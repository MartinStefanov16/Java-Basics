package L03_SwitchCases;

import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            if (product.equals("coffee"))
                System.out.println(amount * 0.50);
            if (product.equals("water"))
                System.out.println(amount * 0.80);
            if (product.equals("beer"))
                System.out.println(amount * 1.20);
            if (product.equals("sweets"))
                System.out.println(amount * 1.45);
            if (product.equals("peanuts"))
                System.out.println(amount * 1.60);
        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee"))
                System.out.println(amount * 0.40);
            if (product.equals("water"))
                System.out.println(amount * 0.70);
            if (product.equals("beer"))
                System.out.println(amount * 1.15);
            if (product.equals("sweets"))
                System.out.println(amount * 1.30);
            if (product.equals("peanuts"))
                System.out.println(amount * 1.50);
        } else if (city.equals("Varna")) {
            if (product.equals("coffee"))
                System.out.println(amount * 0.45);
            if (product.equals("water"))
                System.out.println(amount * 0.70);
            if (product.equals("beer"))
                System.out.println(amount * 1.10);
            if (product.equals("sweets"))
                System.out.println(amount * 1.35);
            if (product.equals("peanuts"))
                System.out.println(amount * 1.55);
        }

    }
}
