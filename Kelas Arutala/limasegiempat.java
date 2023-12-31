import java.util.Scanner;

public class limasegiempat {
    public static void main(String[] args) {

        // Inisialisasi objek input dari class scanner
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int luas, sisi, limasegiempat;

        // Input nilai jari-jari
        System.out.print("Masukan sisi segi4 : ");
        sisi = input.nextInt();

        // Menghitung luas segi4
        luas = sisi * sisi;
        limasegiempat = 5 * luas;

        // Tampilkan hasil
        System.out.println("Luas SegiEmpat = " + luas);
        System.out.println("Luas 5 SegiEmpat = " + limasegiempat);
    }
}
