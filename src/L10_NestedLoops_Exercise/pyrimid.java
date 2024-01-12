package L10_NestedLoops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class pyrimid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 1;

        for (int row = 1; row <= n; row++) {

            for (int i = 0; i < row; i++) {
                System.out.print(count + " ");

                if (count == n) {
                    return;
                }

                count++;

            }
            System.out.println();

        }

        }
    }
