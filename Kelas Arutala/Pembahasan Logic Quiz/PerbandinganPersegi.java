import java.util.Scanner;

public class PerbandinganPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rasioPersegi1, rasioPersegi2, rasioPersegi3;
        double sisiPersegi1, sisiPersegi2, sisiPersegi3, luasPersegi1, luasPersegi2, luasPersegi3, luasPersegiTotal;

        rasioPersegi1 = input.nextInt();
        rasioPersegi2 = input.nextInt();
        rasioPersegi3 = input.nextInt();
        sisiPersegi1 = input.nextDouble();

        // mencari nilai pasti dari rasio
        sisiPersegi2 = sisiPersegi1 / rasioPersegi1 * rasioPersegi2;
        sisiPersegi3 = sisiPersegi1 / rasioPersegi1 * rasioPersegi3;

        // mencari nilai luas persegi
        luasPersegi1 = sisiPersegi1 * sisiPersegi1;
        luasPersegi2 = sisiPersegi2 * sisiPersegi2;
        luasPersegi3 = sisiPersegi3 * sisiPersegi3;

        luasPersegiTotal = luasPersegi1 + luasPersegi2 + luasPersegi3;

        System.out.printf("%.2f", luasPersegiTotal);
    }
}
