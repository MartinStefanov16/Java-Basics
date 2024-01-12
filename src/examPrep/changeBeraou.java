package examPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class changeBeraou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double china = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine());

        double percent = commision / 100.0;

        //to lev
        double bitcoinToLev = bitcoin * 1168;


        double chinaToUSD = china * 0.15;
        double USDToLev = chinaToUSD * 1.76;


        double BGNToEUR = (bitcoinToLev + USDToLev) / 1.95;


        double thefinal = BGNToEUR - (BGNToEUR * percent);

        System.out.printf("%.2f", thefinal);


    }
}
