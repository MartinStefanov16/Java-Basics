package L05_ForCycles;

import java.util.Scanner;

import static java.lang.System.in;

public class numNto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1 ; i--) {
            System.out.println(i);
        }
        
        
        
        
    }
}
