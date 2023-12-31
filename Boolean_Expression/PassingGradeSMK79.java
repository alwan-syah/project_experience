import java.util.Scanner;

public class PassingGradeSMK79 {
    public static void main(String[] args) {
        int mtk, bhsIngg, bhsIndo, ipa; // variabel nilai ujian
        int passingGradeSMK, passingGradeSastra, passingGradeTIK;// variabel nilai syarat kelulusan.
        boolean isPassingSMK, isPassingSastra, isPassingTIK;// variabel untuk menyimpan hasil kelulusan.
        double averageUjian, averageBahasa;

        Scanner input = new Scanner(System.in);

        passingGradeSMK = 73;
        passingGradeSastra = 75;
        passingGradeTIK = 80;

        System.out.println("masuukan nilai Ujian Matematika :");
        mtk = input.nextInt();

        System.out.println("masuukan nilai Ujian B. Indonesia :");
        bhsIndo = input.nextInt();

        System.out.println("masuukan nilai Ujian B. Inggris :");
        bhsIngg = input.nextInt();

        System.out.println("masuukan nilai Ujian IPA :");
        ipa = input.nextInt();

        // menghitung ratarata nilai ujian
        averageUjian = (mtk + bhsIndo + bhsIngg + ipa) / 4;

        // menghitung ratarata nilai bahasa
        averageBahasa = (bhsIndo + bhsIngg) / 2;

        // membuat boolean expression untuk menentukan kelulusan

        // menentukan kelulusan masuk SMK
        isPassingSMK = averageUjian >= passingGradeSMK;

        // menentukan kelulusan masuk jurusan Sastra
        isPassingSastra = averageBahasa >= passingGradeSastra;

        // menentukan kelulusan masuk jurusan Teknik Komputer Jaringan
        isPassingTIK = mtk > passingGradeTIK;

        System.out.println(
                "\n\nHasil dari Simulasi untuk Persyaratan Penerimaan Calon Siswa di SMK Padepokan 79 adalah sebagai berikut :");
        System.out.println("=================================================================================");
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke SMK Padepokan 79 : " + isPassingSMK);
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Sastra : " + isPassingSastra);
        System.out.println(
                "Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Teknik Komputer Jaringan : " + isPassingTIK);

    }
}
