import java.util.Scanner;

public class cekkeltigaempat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int bil, cek;

        bil = input.nextInt();

        if (bil > 0 && bil < 100) {
            cek = (bil % 3 == 0 && bil % 4 == 0) ? 1 : 0;
            System.out.println(cek);
        }

    }
}
