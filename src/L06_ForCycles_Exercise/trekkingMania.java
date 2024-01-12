package L06_ForCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class trekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int groupAmount = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int Kalimanjaro = 0;
        int k2 = 0;
        int everest = 0;


        for (int i = 0; i < groupAmount; i++) {
            int peoplePerGroup = Integer.parseInt(scanner.nextLine());

            if (peoplePerGroup <= 5) {
                musala += peoplePerGroup;
            } else if (peoplePerGroup <= 12) {
                monblan += peoplePerGroup;
            } else if (peoplePerGroup <= 25) {
                Kalimanjaro += peoplePerGroup;
            } else if (peoplePerGroup <= 40) {
                k2 += peoplePerGroup;
            } else {
                everest += peoplePerGroup;
            }

        }

        int totalPeople = musala + monblan + Kalimanjaro + k2 + everest;

        System.out.printf("%.2f%%\n", musala * 1.0 / totalPeople * 100 );
        System.out.printf("%.2f%%\n", monblan * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", (Kalimanjaro * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%\n", (k2 * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%\n", (everest * 1.0 / totalPeople) * 100);

    }
}
