import java.util.Scanner;

public class mesinatmeva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Deklarasi variabel
        int uang;
        double saldo, saldoakhir;

        // input data
        uang = input.nextInt();
        saldo = input.nextDouble();

        // menghitung saldo akhir
        saldoakhir = saldo - uang - 0.5;

        // menampilkan output
        if (saldoakhir >= 0) {
            System.out.printf("%.2f", saldoakhir);
        } else {
            System.out.printf("%.2f", saldo);
        }
    }
}
