import java.util.Scanner;

public class CekTengkiBensin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int uang;
        double tangki, jumlahBensin, biayabensin = 7600;

        // input data
        uang = input.nextInt();
        tangki = input.nextDouble();

        // menghitung jumlah tangki
        jumlahBensin = uang / biayabensin;

        // menampilkan output
        if (jumlahBensin < tangki) {
            System.out.printf("%.2f", jumlahBensin);
        } else {
            System.out.printf("%.2f%n", jumlahBensin);
            System.out.println("Bensin Berlebih");
        }
    }
}
