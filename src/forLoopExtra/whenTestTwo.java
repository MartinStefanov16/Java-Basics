package forLoopExtra;

import java.util.Scanner;

import static java.lang.System.in;

public class whenTestTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        String input = scanner.nextLine();

        int sum = 0;

        // reads from console until a goal is reached

        // goal 1: reach 100 and print reached number
        // goal 2: "stop" text is read and reached number is printed
        while (!input.equals("stop")) {
            int n = Integer.parseInt(input);

            sum += n;

            if (sum >= 100) {
                break;
            }



        }
        System.out.println(sum);
    }
}
