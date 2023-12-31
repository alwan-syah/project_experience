import java.util.Random;

public class nilaiacak2 {
    public static void main(String[] args) {
        Random angkaRandom = new Random();
        for (int i = 0; i <= 3000; i++) {
            System.out.print(angkaRandom.nextInt(3000) + 1);
        }
    }

}
