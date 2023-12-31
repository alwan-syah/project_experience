import java.util.Scanner;

public class NestingLoop {
    public static void main(String[] args) {
        // this is #i - I'll call it "CN"
        for (char c = 'A'; c <= 'g'; c++) {
            for (int n = 1; n <= 3; n++) {
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print("(" + a + "," + b + ")");
            }
            System.out.println();
        }

        System.out.println("\b");
    }
}