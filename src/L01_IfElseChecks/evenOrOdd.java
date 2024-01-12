package L01_IfElseChecks;

import java.util.Scanner;

public class evenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = Integer.parseInt(scanner.nextLine());

        if (numberA % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
