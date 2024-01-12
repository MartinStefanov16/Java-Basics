package L07_WhileCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class readingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine();

        }
    }
}
