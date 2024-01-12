package L09_NestedLoops.exer;

import java.util.Scanner;

import static java.lang.System.in;

public class building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int floors = Integer.parseInt(scanner.nextLine());
        int apartments = Integer.parseInt(scanner.nextLine());


        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < apartments; j++) {

                if (i == floors) {
                    System.out.printf("L%d%d ",i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ",i, j);
                } else {
                    System.out.printf("A%d%d ",i, j);
                }

            }
            System.out.println();

        }
    }
}
