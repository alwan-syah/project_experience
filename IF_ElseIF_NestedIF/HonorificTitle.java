import java.util.Scanner;

public class HonorificTitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String title, namaDepan, namaBelakang, jenisKelamin;
        int umur;

        System.out.print("Nama Depan :");
        namaDepan = input.next();

        System.out.print("Nama Belakang :");
        namaBelakang = input.next();

        System.out.print("Umur : ");
        umur = input.nextInt();

        System.out.print("Jenis Kelamin (Pria/Wanita) :");
        ;
        jenisKelamin = input.next();

        if (umur < 20) {
            title = namaDepan;
        } else {
            if (jenisKelamin.equals("Wanita")) {
                System.out.print("Apakah Anda sudah Menikah? (Ya/Tidak) : ");
                String status = input.next();

                if (status.equals("Ya")) {
                    title = "Mrs. ";
                } else {
                    title = "Ms. ";
                }
            } else {
                title = "Mr. ";
            }
        }

        // hasil output
        System.out.println();
        System.out.println("Hello " + title + namaBelakang);
    }
}
