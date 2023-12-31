import java.util.Scanner;

public class parkirbilrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenisKendaraan, lamaparkir;
        int biayaparkir = 0;
        // int motor = 1000;
        // int mobil = 2000;

        // input data
        jenisKendaraan = input.nextInt();
        lamaparkir = input.nextInt();

        // menghitung biaya parkir
        if (jenisKendaraan == 1) {
            if (lamaparkir <= 1) {
                biayaparkir = 2000;
            } else {
                biayaparkir = 2000 + (lamaparkir - 1) * 1000;
            }
        } else if (jenisKendaraan == 2) {
            if (lamaparkir <= 1) {
                biayaparkir = 1000;
            } else {
                biayaparkir = 1000 + (lamaparkir - 1) * 500;
            }

        } else {

        }
        System.out.println(biayaparkir);

    }
}
