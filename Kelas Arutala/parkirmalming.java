import java.util.Scanner;

public class parkirmalming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int jeniskendaraan, lamaparkir;
        int biayaparkirawal = 0;
        int biayaparkirtambahan = 0;
        String lama = "disegel";

        // input data
        jeniskendaraan = input.nextInt();
        lamaparkir = input.nextInt();

        // menentukan kendaraan biaya parkir dasar
        if (jeniskendaraan == 1) {
            biayaparkirawal = 1500 * lamaparkir;
        } else if (jeniskendaraan == 2) {
            biayaparkirawal = 1000 * lamaparkir;
        } else {
            return;
        }

        // menghitung biaya parkir tambahan
        if (lamaparkir >= 5) {
            biayaparkirtambahan = 500 * (lamaparkir - 5);
        }

        // menghitung total biaya parkir
        int totalbiayaparkir = biayaparkirawal + biayaparkirtambahan;

        // mencetak output
        if (lamaparkir >= 8) {
            System.out.println(lama);
        } else {
            System.out.println(totalbiayaparkir);
        }
    }

}
