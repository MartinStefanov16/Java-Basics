package L04_SwitchCases_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int daysStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        double price = 0.00;

        switch (roomType) {
            case "room for one person":
                price = (daysStay - 1) * 18;
                break;
            case "apartment":
                price = (daysStay - 1) * 25;
                break;
            case "president apartment":
                price = (daysStay - 1) * 35;
                break;
        }


        // discount
       switch (roomType) {
           case "apartment":

               if (daysStay < 10) {
                   price = price - (price * 0.30);
               } else if (daysStay > 10 && daysStay < 15) {
                   price = price - (price * 0.35);
               } else if (daysStay > 15) {
                   price = price - (price * 0.50);
               }

               break;
           case "president apartment":

               if (daysStay < 10) {
                   price = price - (price * 0.10);
               } else if (daysStay > 10 && daysStay < 15) {
                   price = price - (price * 0.15);
               } else if (daysStay > 15) {
                   price = price - (price * 0.20);
               }
               break;
       }

       switch (review) {
           case "positive":
               price =  price + (price * 0.25);
               break;
           case "negative":
               price =  price - (price * 0.10);
               break;
       }

        System.out.printf("%.2f", price);


    }
}
