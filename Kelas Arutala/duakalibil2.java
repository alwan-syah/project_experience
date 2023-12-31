import java.util.Scanner;

public class duakalibil2 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int input;
        int hasil;

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        input = scanner.nextInt();

        // Menghitung hasil
        hasil = input * 2;

        // Menampilkan hasil
        System.out.println("Bilangan yang tepat dua kali lipat dari bilangan yang Anda masukkan adalah: " + hasil);
    }
}