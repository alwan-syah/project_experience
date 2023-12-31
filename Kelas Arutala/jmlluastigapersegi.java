import java.util.Scanner;

public class jmlluastigapersegi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int r1, r2, r3;
        double s, luas1, luas2, luas3, jumlahluas;

        // input data
        r1 = input.nextInt();
        r2 = input.nextInt();
        r3 = input.nextInt();
        s = input.nextDouble();

        // menghitung luas persegi 1
        luas1 = s * s / Math.pow(r1, 2);

        // menghitung luas persegi 2
        luas2 = s * s / Math.pow(r2, 2);

        // menghitung luas persegi 3
        luas3 = s * s / Math.pow(r3, 2);

        // menjumlahkan semua luas
        jumlahluas = luas1 + luas2 + luas3;

        System.out.printf("%.2f", jumlahluas);
    }
}
