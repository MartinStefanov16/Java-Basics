package examPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class birthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.20;
        double drinks = cake - (cake * 0.45);
        double animator = rent / 3;

        System.out.println(cake + drinks + animator + rent);
    }
}
