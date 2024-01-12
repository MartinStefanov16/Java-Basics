package L08_WhileCycles_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int widthCm = Integer.parseInt(scanner.nextLine());
        int lenghtCm = Integer.parseInt(scanner.nextLine());

        int amountOfPieces = widthCm * lenghtCm;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int takenPieces = Integer.parseInt(input);

            amountOfPieces -= takenPieces;

            if (amountOfPieces < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(amountOfPieces));
                return;
            }


            input = scanner.nextLine();
        }

        System.out.printf("%d pieces are left.", amountOfPieces);



    }
}
