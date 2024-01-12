package L03_SwitchCases;

import java.util.Scanner;

public class commision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commision = 0;

        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                commision = 5;
            } else if (sales > 500 && sales <= 1000) {
                commision = 7;
            } else if (sales > 1000 && sales <= 10000) {
                commision = 8;
            } else if (sales >= 10000) {
                commision = 12;
            }
        }else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                commision = 4.5;
            } else if (sales > 500 && sales <= 1000) {
                commision = 7.5;
            } else if (sales > 1000 && sales <= 10000) {
                commision = 10;
            } else if (sales >= 10000) {
                commision = 13;
            }
        }else if (city.equals("Plovdiv")) {
                    if (sales >= 0 && sales <= 500) {
                        commision = 5.5;
                    } else if (sales > 500 && sales <= 1000) {
                        commision = 8;
                    } else if (sales > 1000 && sales <= 10000) {
                        commision = 12;
                    } else if (sales >= 10000) {
                        commision = 14.5;
                    }
                }

        if (commision == 0) {
            System.out.println("error");
        } else
            System.out.printf("%.2f", commision / 100 * sales);

            }
        }