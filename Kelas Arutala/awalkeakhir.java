import java.util.Scanner;

public class awalkeakhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
}
