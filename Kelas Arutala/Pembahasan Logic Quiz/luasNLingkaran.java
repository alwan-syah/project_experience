import java.util.Scanner;

public class luasNLingkaran {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int jari, jumlah;
        double luas, phi = 3.14;

        // input data
        jari = input.nextInt();
        jumlah = input.nextInt();

        // menghitung luas lingkaran
        luas = phi * jari * jari * jumlah;

        // menampilkan output
        System.out.printf("%.2f", luas);
    }
}
