import java.util.Scanner;

public class ganjilgenap {

    public static void main(String[] args) {
        // Deklarasi variabel
        int input;

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextInt();

        // Menentukan apakah bilangan ganjil atau genap
        if (input % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
    }
}
