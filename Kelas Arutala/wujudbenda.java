import java.util.Scanner;

public class wujudbenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double suhu = input.nextDouble();

        if (suhu > -150 && suhu < 150) {
            System.out.println("berwujud cair");
        } else {
            System.out.println("berwujud non cair");
        }

        input.close();
    }

}
