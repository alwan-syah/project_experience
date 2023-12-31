import java.util.Scanner;

public class JobVacation {
    public static void main(String[] args) {
        // Deklarasi variabel yang diperlukan.
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner input = new Scanner(System.in);

        // buat output text yang dibutuhkan
        System.out.println("Selamat data di PT. Secret Semut 79");
        System.out.println("===================================\n");
        System.out.println("silahkan input Data Anda");
        System.out.println("Nama : ");
        nama = input.next();

        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan : ");
        penampilan = input.nextDouble();

        // pengecekan data untuk persyaratan Koordinator
        /*
         * 1. persyaratan Coordinator:
         * 
         * Pria
         * umur minimal 21 tahun dan maksimal 30 tahun.
         * Lulusan SMK/D3
         * Memilki pengalaman minimal 2 tahun
         * 
         * Atau
         * 
         * Pria umur 30 tahun ke atas
         * Lulusan S1
         * Memiliki pengalaman minimal 5 tahun
         * 
         */

        // persyaratan koordinator 1
        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("S1"))
                && pengalaman >= 2;

        // persyaratan koordinator 2
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1")
                && pengalaman >= 5;

        // hasil dari koordinator
        isPassingKoor = reqKoor1 || reqKoor2;

        // pengecekan data untuk persyaratan Admin
        /*
         * Persyaratan admin:
         * 
         * wanita
         * umur minimal 20 tahun dan maksimal 25 tahun.
         * Lulusan D3
         * memiliki penampilan yang menarik atau pengalaman minimal 1 tahun
         * 
         * atau
         * 
         * wanita
         * umur diatas 25
         * lulusan S1
         * memiliki penampilan yang menarik
         * memiliki pengalaman minimal 3 tahun
         * 
         * p
         * 
         * 
         */

        // persyaratan Admin 1
        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 &&
                lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);

        // persyaratan Admin 2
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1")
                && penampilan >= 8.5 && pengalaman >= 3;

        // Hasil dari Admin
        isPassingAdmin = reqAdmin1 || reqAdmin2;

        // Membuat Output Text Hasil
        System.out.println();
        System.out.println(nama + ", Terima kasih sudah mengikuti lowongan kerja di PT. Secret Semut 79.\n");
        System.out.println("Berikut adalah hasil dari rekrutment untuk Koordinator dan Admin :");
        System.out.println("Hasil Kelulusan untuk Koordinator : " + isPassingKoor);
        System.out.println("Hasil Kelulusan untuk Admin : " + isPassingAdmin);
    }
}
