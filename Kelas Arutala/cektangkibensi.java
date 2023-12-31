import java.util.Scanner;

public class cektangkibensi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int uang;
        double kapasitas;
        double jumlahbensin;

        uang = input.nextInt();
        kapasitas = input.nextDouble();

        // menghitung jumlah bensi yang dibeli
        jumlahbensin = uang / 7600;

        // menentukan kapasitas tangki mencukupi
        if (jumlahbensin < kapasitas) {
            System.out.printf("%.2f%n", jumlahbensin);
        } else {
            // jumlahbensin = kapasitas;
            System.out.printf("%.2f%n", jumlahbensin);
            System.out.println("Bensin Berlebih");

        }
    }
}
