package L06_ForCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int numbers = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 0; i < numbers; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum < 200) {
                p1 += 1;
            } else if (currentNum <= 399) {
                p2 += 1;
            } else if (currentNum <= 599) {
                p3 += 1;
            } else if (currentNum <= 799) {
                p4 += 1;
            } else {
                p5 += 1;

            }

        }

        System.out.printf("%.2f%%\n", p1 * 1.00 / numbers * 100 );
        System.out.printf("%.2f%%\n", p2 * 1.00 / numbers * 100 );
        System.out.printf("%.2f%%\n", p3 * 1.00 / numbers * 100 );
        System.out.printf("%.2f%%\n", p4 * 1.00 / numbers * 100 );
        System.out.printf("%.2f%%\n", p5 * 1.00 / numbers * 100 );


    }
}