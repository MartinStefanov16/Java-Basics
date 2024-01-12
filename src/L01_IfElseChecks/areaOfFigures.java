package L01_IfElseChecks;

import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter shape");
        String shape = scanner.nextLine();

        if (shape.equals("square")) {
            System.out.println("Enter side");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", a * a);
        } else if (shape.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", a * b);
        } else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", r * r * Math.PI);
        } else if (shape.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine()); // lenght
            double b = Double.parseDouble(scanner.nextLine()); // hight
            System.out.printf("%.3f", a / 2 * b );
        }
    }
}