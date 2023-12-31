import java.util.Scanner;

public class segitigabintang {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int tinggisegitiga, i, j;

        tinggisegitiga = input.nextInt();
        for (i = 1; i <= tinggisegitiga; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
