import java.util.Scanner;

public class PerulanganForeach {
    public static void main(String[] args) {
        // membuat array
        int angka[] = { 3, 1, 46, 24, 17 };

        // menggunakan perulangan for each untuk menapilkan angka
        for (int x : angka) {
            System.out.print(x + " ");
        }
    }
}
