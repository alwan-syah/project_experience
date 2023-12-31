import java.util.Scanner;

public class kalimatalay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String kalimat;
        int i;

        // Membaca input
        kalimat = input.nextLine();

        // mengubah kalimat menjadi kalimat alay
        for (i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            switch (c) {
                case 'a':
                case 'A':
                    kalimat = kalimat.replace(c, '4');
                    break;
                case 'i':
                case 'I':
                    kalimat = kalimat.replace(c, '1');
                    break;
                case 'z':
                case 'Z':
                    kalimat = kalimat.replace(c, '2');
                    break;
                case 'e':
                case 'E':
                    kalimat = kalimat.replace(c, '3');
                    break;
                case 'g':
                case 'G':
                    kalimat = kalimat.replace(c, '6');
                    break;
                case 'j':
                case 'J':
                    kalimat = kalimat.replace(c, '7');
                    break;
                case 'b':
                case 'B':
                    kalimat = kalimat.replace(c, '8');
                    break;
                default:
                    break;
            }
        }

        System.out.println(kalimat);
    }
}
