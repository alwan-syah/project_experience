import java.util.Scanner;

public class tindakansatpam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int kasus, banyakKasus;
        String tindakan = "";

        // Membaca input
        kasus = input.nextInt();
        banyakKasus = input.nextInt();

        // menentukan tindakan
        switch (kasus) {
            case 1:
                if (banyakKasus < 4) {
                    tindakan = "Serahkan KTP anda !!!";
                } else {
                    tindakan = "Bayar Denda 10000 !!!";
                }
                break;
            case 2:
                tindakan = "Ambil STNK dulu !!!";
                break;
            default:

        }

        // menampilkan output
        System.out.print(tindakan);
    }
}
