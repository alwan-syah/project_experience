import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args) {
        // Deklarasi variabel yang diperlukan
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin, posisi, hasil;
        boolean isPassing;

        Scanner input = new Scanner(System.in);

        // output text untuk kebutuha data input user
        System.out.println("Selamat datang di PT. Secret Semut 79");
        System.out.println("=========================================\n");

        System.out.println("Silahkan Input data Anda : \n");

        System.out.print("Nama : ");
        nama = input.next();

        System.out.print("Umur : ");
        umur = input.nextInt();

        System.out.print("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.next();

        System.out.print("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.print("Pengalaman (Tahun): ");
        pengalaman = input.nextInt();

        System.out.print("Penampilan (1 s.d 10) : ");
        penampilan = input.nextInt();

        System.out.print("Posisi yang dilamar (SPV, Admin atau Koordinator) : ");
        posisi = input.next();

        // kondisi if untuk menentukan posisi yang dipilih
        if (posisi.equalsIgnoreCase("Koordinator")) {
            // pemanggilan dan penggunaan Function
            isPassing = validateKoordinator(umur, jenisKelamin, lulusan, pengalaman, penampilan);

        } else if (posisi.equalsIgnoreCase("Admin")) {
            // pemanggilan dan penggunaan function untuk validasi admin
            isPassing = validateAdmin(umur, jenisKelamin, lulusan, pengalaman, penampilan);

        } else if (posisi.equalsIgnoreCase("SPV")) {
            // pemanggilan dan penggunaan function untuk validasi SPV
            isPassing = validateSPV(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } else {
            // Hasil ketika posisi yang dimasukan tidak sesuai atau tidak ada.
            isPassing = false;
        }

        // membuat kondisi if untuk menentukan hasil output text

        if (isPassing) {
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi
                    + ". dan akan masuk ke tahap selanjutnya.";
        } else {
            hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai " + posisi
                    + ". dan tidak akan masuk ke tahap selanjutnya.";
        }

        printResult(nama, hasil, posisi);
    }

    // membuat function untuk validasi posisi koordinator
    // method return value berupa boolean
    public static boolean validateKoordinator(int umur, String jenisKelamin, String lulusan, int pengalaman,
            double penampilan) {
        // deklarasi variable lokal
        boolean reqKoor1, reqKoor2, result;

        // membuat kondisi setiap kriteria koordinator
        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 &&
                (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1")
                && pengalaman >= 5;

        // kondisi if untuk menentukan hasil kelulusan posisi Korrdinator
        if (reqKoor1 || reqKoor2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    // membuat function untuk validasi posisi koordinator
    // method return value berupa boolean
    public static boolean validateAdmin(int umur, String jenisKelamin, String lulusan, int pengalaman,
            double penampilan) {
        // deklarasi variable lokal
        boolean reqAdmin1, reqAdmin2, reqAdmin3, result;

        // membuat kondisi setiap kriteria Admin
        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 &&
                lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1")
                && penampilan >= 8.5 && pengalaman >= 3;
        reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 20 && umur <= 30 && penampilan >= 8.5 &&
                (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 3;

        // kondisi if untuk menentukan hasil kelulusan posisi Admin
        if (reqAdmin1 || reqAdmin2 || reqAdmin3) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    // membuat function untuk validasi posisi SPV
    // method return value berupa boolean
    public static boolean validateSPV(int umur, String jenisKelamin, String lulusan, int pengalaman,
            double penampilan) {
        // deklarasi variabel lokal
        boolean reqSpv1, reqSpv2, result;

        // membuat kondisi setiap kriteria SPV
        reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;
        reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4;

        // kondisi if untuk menentukan hasil kelulusan Posisi SPV
        if (reqSpv1 || reqSpv2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    // membuat function untuk menampilkan hasil rekrutmen
    // method atau function berupa void
    public static void printResult(String nama, String hasil, String posisi) {
        System.out.println();
        System.out.println(nama + ", Terima Kasih sudah mengiktui Lowongan Kerja di PT. Secret Semut 79.\n");
        System.out.println("Berikut adalah Hasil dari Posisi  " + posisi + " :");
        System.out.println(hasil);
    }
}
