import java.util.Scanner;

public class duakalibil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // Menampilkan dua kali lipat bilangan
        int duaKaliBilangan = bilangan * 2;
        System.out.print(duaKaliBilangan);
    }
}
