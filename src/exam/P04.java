package exam;

import java.util.Scanner;

import static java.lang.System.in;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int days = Integer.parseInt(scanner.nextLine());

        double totalLiter = 0;
        double totalDegree = 0;

        for (int i = 1; i <= days; i++) {
            double rakiyaAmount = Double.parseDouble(scanner.nextLine());
            double rakiyaDegree = Double.parseDouble(scanner.nextLine());

            totalLiter += rakiyaAmount;
            totalDegree += rakiyaAmount * rakiyaDegree;
        }

        double averageDegree = totalDegree / totalLiter;

        System.out.printf("Liter: %.2f\n", totalLiter);
        System.out.printf("Degrees: %.2f\n", averageDegree);

        if (averageDegree < 38) {
            System.out.println("Not good, you should baking!");
        } else if (averageDegree >= 38 && averageDegree <= 42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }




    }
}
