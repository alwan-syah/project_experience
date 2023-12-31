import java.util.Scanner;

public class reamur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int reamur = input.nextInt();

        double kelvin = reamur * 1.25 + 273;

        if (reamur >= -273 && reamur <= 80) {
            System.out.printf("%.2f%n", kelvin);
        } else {
            System.out.println("bukan suhu reamur");
        }

    }
}
