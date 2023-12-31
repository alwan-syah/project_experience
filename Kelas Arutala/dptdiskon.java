import java.util.Scanner;

public class dptdiskon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double hargaBarang, jumlahBarang, potongan, totalHarga = 0;

        // input data
        hargaBarang = input.nextDouble();
        jumlahBarang = input.nextDouble();

        // kondisi input
        if (hargaBarang >= 10000 && hargaBarang <= 100000) {
            if (jumlahBarang >= 1 && jumlahBarang <= 100) {

                // menghitung potongan
                if (jumlahBarang % 3 == 0 && jumlahBarang % 4 == 0) {
                    potongan = hargaBarang * 0.15;
                } else {
                    potongan = 0;
                }

                // menghitung total harga
                totalHarga = hargaBarang * jumlahBarang - potongan;
            }
        }
        System.out.printf("%.2f", totalHarga);
    }
}