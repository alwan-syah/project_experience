import java.util.Scanner;

public class luaslingkaranbaru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int n = input.nextInt();
        double phi = 3.14;
        double v = phi * r * r;

        if (r > 0 && r <= 100) {
            if (n > 0 && n <= 50) {
                System.out.printf("%.2f%n", v);
            }
        }

    }
}
