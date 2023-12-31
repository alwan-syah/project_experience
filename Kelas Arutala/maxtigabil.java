import java.util.Scanner;

public class maxtigabil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int besar = 0;

        int num1 = input.nextInt();
        input.nextLine();
        int num2 = input.nextInt();
        input.nextLine();
        int num3 = input.nextInt();
        input.nextLine();

        if (num1 >= -30 && num1 <= 30) {
            if (num2 >= -30 && num2 <= 30) {
                if (num3 >= -30 && num3 <= 30) {
                    besar = num1;
                    if (num2 > besar) {
                        besar = num2;
                    }
                    if (num3 > besar) {
                        besar = num3;
                    }
                }
            }
        }
        System.out.println(besar);
    }
}
