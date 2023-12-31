import java.util.Scanner;

public class biayaparkirbiltor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int jenisKendaraan, lamaparkir, biayaparkir = 0;

        // input data
        jenisKendaraan = input.nextInt();
        lamaparkir = input.nextInt();

        // menentukan jenis kendaraan dan biaya parkir
        if (jenisKendaraan == 1) {
            if (lamaparkir <= 1) {
                biayaparkir = 2000;
            } else {
                biayaparkir = 2000 + (lamaparkir - 1) * 1000;
            }
        }
        if (jenisKendaraan == 2) {
            if (lamaparkir <= 1) {
                biayaparkir = 1000;
            } else {
                biayaparkir = 1000 + (lamaparkir - 1) * 500;
            }
        }

        System.out.println(biayaparkir);
    }
}
