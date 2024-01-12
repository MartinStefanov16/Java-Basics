package L01_IfElseChecks;

import static java.lang.System.in;
import java.util.Scanner;

public class passwordGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String pass = scanner.nextLine();

       if (pass.equals("s3cr3t!P@ssw0rd")) {
        System.out.println("Welcome");
       } else {
           System.out.println("Wrong password!");
       }


    }
}
