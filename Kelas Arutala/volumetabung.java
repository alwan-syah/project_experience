import java.util.Scanner;

public class volumetabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int t = input.nextInt();
        double phi = 3.14;
        double v = phi * (r * r) * t;

        if (r > 0 && r <= 100) {
            if (t > 0 && t <= 100) {
                System.out.printf("%.2f%n", v);
            } else {

            }

        }
    }
}
