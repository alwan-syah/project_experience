
import java.util.Scanner;

public class diskonbelanja {

    public static void main(String[] args) {

        // Inisialisasi variabel
        Scanner input = new Scanner(System.in);
        double totalBelanja = 0;
        boolean adaminyak = false;

        // Input data belanja
        System.out.print("Masukkan total belanja anda: ");
        totalBelanja = input.nextDouble();
        System.out.print("Apakah anda belanja minyak goreng SSS? (Y/N)");
        String adaMinyakString = input.next();
        if (adaMinyakString.equals("Y")) {
            adaminyak = true;
        }

        // Hitung diskon
        double diskon = 0;
        if (totalBelanja > 1000000) {
            if (adaminyak) {
                diskon = 0.1;
            } else {
                diskon = 0.05;
            }
        }

        // Hitung total bayar
        double totalBayar = totalBelanja - diskon * totalBelanja;

        // Tampilkan hasil
        System.out.println("Total belanja: Rp " + totalBelanja);
        System.out.println("Diskon: " + diskon * 100 + "%");
        System.out.println("Total bayar: Rp " + totalBayar);
    }
}
