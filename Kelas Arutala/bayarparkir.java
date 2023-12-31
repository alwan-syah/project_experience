import java.util.Scanner;

public class bayarparkir {

    public static void main(String[] args) {
        // Inisialisasi variabel
        Scanner input = new Scanner(System.in);
        String hari = "";
        String jenisKendaraan = "";
        int waktuParkir = 0;

        // Input data
        System.out.print("Masukkan hari (Senin-Minggu): ");
        hari = input.next();
        System.out.print("Masukkan jenis kendaraan (Mobil/Motor): ");
        jenisKendaraan = input.next();
        System.out.print("Masukkan waktu parkir (dalam jam): ");
        waktuParkir = input.nextInt();

        // Hitung biaya parkir
        int biayaParkir = 0;
        if (hari.equals("Sabtu") || hari.equals("Minggu")) {
            if (jenisKendaraan.equals("Mobil")) {
                biayaParkir = 2500 + (waktuParkir - 1) * 1500;
            } else if (jenisKendaraan.equals("Motor")) {
                biayaParkir = 1500 + (waktuParkir - 1) * 1000;
            }
        } else {
            if (jenisKendaraan.equals("Mobil")) {
                biayaParkir = 2000 + (waktuParkir - 1) * 1000;
            } else if (jenisKendaraan.equals("Motor")) {
                biayaParkir = 1000 + (waktuParkir - 1) * 500;
            }
        }

        // Jika parkir lebih dari 8 jam, maka biaya parkirnya menjadi Rp. 50.000
        if (waktuParkir > 8) {
            biayaParkir = 50000;
        }

        // Tampilkan hasil
        System.out.println("Biaya parkir: Rp " + biayaParkir);
    }
}