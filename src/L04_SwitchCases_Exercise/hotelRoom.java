package L04_SwitchCases_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String month = scanner.nextLine();
        int daysStay = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.00;
        double apartmentPrice = 0.00;

        switch (month) {
            case "May":
            case "October":
                studioPrice = daysStay * 50;
                apartmentPrice =daysStay * 65;
                break;
            case "June":
            case "September":
                studioPrice = daysStay * 75.20;
                apartmentPrice = daysStay * 68.70;
                break;
            case "July":
            case "August":
                studioPrice = daysStay * 76;
                apartmentPrice = daysStay * 77;
                break;
        }

        if (month.equals("May") || month.equals("October") ) {

            if (daysStay > 14) {
                studioPrice = studioPrice - (studioPrice * 0.30);
            } else if (daysStay > 7) {
                studioPrice = studioPrice - (studioPrice * 0.05);
            }
        } else if ((month.equals("June") || month.equals("September")) && daysStay > 14) {
            studioPrice = studioPrice - (studioPrice * 0.20);
        }

        if (daysStay > 14) {
            apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.%n", studioPrice);



    }
}
