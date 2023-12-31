import java.util.Scanner;

public class max3bil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int num1, num2, num3, besar = 0;

        // input data
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        // menentukan bilangan terbesar
        if (num1 > num2) {
            besar = num1;
        } else if (num2 > num3) {
            besar = num2;
        } else if (num3 > num1) {
            besar = num3;
        }

        System.out.println(besar);
    }
}