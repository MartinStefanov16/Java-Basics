package L07_WhileCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String name = scanner.nextLine();

        int klas = 1;
        double gradeSum = 0;
        int timesFailed = 0;

        while (klas <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());



            if (grade < 4) {
                timesFailed++;

                if (timesFailed == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, klas);
                    return;
                }

                continue;
            }





            gradeSum += grade;
            klas++;

        }

        double average = gradeSum / 12;

        System.out.printf("%s graduated. Average grade: %.2f", name, average);



    }
}
