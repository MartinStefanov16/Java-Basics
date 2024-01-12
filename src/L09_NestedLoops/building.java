package L09_NestedLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int floors =  Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        //char type;

        for (int i = floors; i > 0; i--) {
            for (int j = 0; j < rooms; j++) {

                if (i == floors) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }

            }
            System.out.println();

        }
    }
}
