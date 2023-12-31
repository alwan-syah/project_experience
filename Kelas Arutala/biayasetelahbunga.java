import java.util.Scanner;

public class biayasetelahbunga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double biayaawal = input.nextDouble();

        double bunga = input.nextDouble();

        double totalbiaya = biayaawal + (biayaawal * (bunga / 100));

        System.out.printf("%.2f%n", totalbiaya);

    }
}
