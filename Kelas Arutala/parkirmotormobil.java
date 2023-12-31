import java.util.Scanner;

public class parkirmotormobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenisKendaraan, lamaparkir;
        int biayaparkir;
        int motor = 1000;
        int mobil = 2000;

        // input data
        jenisKendaraan = input.nextInt();
        lamaparkir = input.nextInt();

        // menghitung biaya parkir
        if (jenisKendaraan == 1) {
            biayaparkir = mobil + (lamaparkir - 1) * 1000;
        } else if (jenisKendaraan == 2) {
            biayaparkir = motor + (-1) * 500;
        } else {

        }

        // jika lebih dari 1 jam
        if (lamaparkir > 1) {
            biayaparkir = lamaparkir * mobil;
        }
    }
}
