package L10_NestedLoops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        int jury = Integer.parseInt(scanner.nextLine());

        String presentationName = scanner.nextLine();
        double totalPresentationsScore = 0;
        int totalPresentations = 0;

        while (!presentationName.equals("Finish")) {


            double currentPresentationTotalScore = 0;
            for (int i = 0; i < jury; i++) {
                double score = Double.parseDouble(scanner.nextLine());

                currentPresentationTotalScore += score;

            }
            double averageSinglePresentScore = currentPresentationTotalScore / jury;

            System.out.printf("%s - %.2f.\n", presentationName, averageSinglePresentScore);
            totalPresentationsScore += averageSinglePresentScore;
            totalPresentations++;


            presentationName = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalPresentationsScore / totalPresentations);
    }
}
