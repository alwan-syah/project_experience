import java.util.Scanner;

public class PromoPujaSera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        double harga, totalUang, potonganHarga, minimalPesan = 50000;
        int tglLahir;

        // input data
        harga = input.nextDouble();
        tglLahir = input.nextInt();

        // potongan harga
        potonganHarga = 0.02 * tglLahir * harga;

        // yang dibayar mahasiswa jika dapat diskon
        totalUang = harga - potonganHarga;

        // menentukan diskon
        if (harga >= minimalPesan) {
            System.out.printf("%.2f", totalUang);
        } else {
            System.out.printf("%.2f", harga);
        }
    }
}
