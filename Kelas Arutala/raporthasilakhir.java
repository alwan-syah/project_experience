import java.util.Scanner;

public class raporthasilakhir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variabel
        int tugas, uts, uas;
        double nilaiakhir;

        // input nilai
        tugas = input.nextInt();
        uts = input.nextInt();
        uas = input.nextInt();

        // menghitung nilai
        nilaiakhir = (tugas * 0.25) + (uts * 0.30) + (uas * 0.45);

        if (nilaiakhir >= 80) {
            System.out.println("Nilai " + nilaiakhir + " Dengan hasil Akhir A");
        } else if (nilaiakhir >= 70) {
            System.out.println("Nilai " + nilaiakhir + " Dengan hasil Akhir B");
        } else if (nilaiakhir >= 55) {
            System.out.println("Nilai " + nilaiakhir + " Dengan hasil Akhir C");
        } else if (nilaiakhir >= 40) {
            System.out.println("Nilai " + nilaiakhir + " Dengan hasil Akhir D");
        } else if (nilaiakhir < 40) {
            System.out.println("Nilai " + nilaiakhir + " Dengan hasil Akhir E");
        }
    }
}
