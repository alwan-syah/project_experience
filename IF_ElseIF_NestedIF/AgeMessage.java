import java.util.Scanner;

public class AgeMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;

        System.out.println("Berapa umur kamu?");
        umur = input.nextInt();

        if (umur >= 18) {
            System.out.println("Kamu dapat membuat Surat Izin mengemudi (SIM)");
        }
        if (umur >= 17) {
            System.out.println("Mendapatkan Kartu Tanda Penduduk (KTP)");
        }
        if (umur >= 25) {
            System.out.println("Menikah diusia ideal");
        }
    }

}
