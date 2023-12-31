import java.util.Scanner;

public class tukarnilai {
    public static void main(String[] args) {

        // Inisialisasi objek input dari class scanner
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int a, b;

        // Input nilai yg diinginkan
        System.out.print("Masukan angka yang diinginkan 1 : ");
        a = input.nextInt();

        System.out.print("Masukan angka yang diinginkan 2 : ");
        b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        // Tampilkan hasil
        System.out.println("angka 1 setelah ditukar " + a);
        System.out.println("angka 2 setelah ditukar " + b);

    }

}
