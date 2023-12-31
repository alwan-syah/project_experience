import java.util.Scanner;

public class angkamenuju {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int awal = input.nextInt();
        int akhir = input.nextInt();

        for (int i = awal; i <= akhir; i++) {
            System.out.print(i + " ");
        }
    }
}
