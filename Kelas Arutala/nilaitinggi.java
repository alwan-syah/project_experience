import java.util.Scanner;

public class nilaitinggi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int[] data = new int[30];
        int tertinggi = Integer.MIN_VALUE;

        // Membaca data
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();

            // Memperbarui nilai tertinggi
            if (data[i] > tertinggi) {
                tertinggi = data[i];
            }
        }

        // Menampilkan nilai tertinggi
        System.out.println("Nilai tertinggi: " + tertinggi);
    }
}
