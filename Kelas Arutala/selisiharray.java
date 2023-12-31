
import java.util.Arrays;

public class selisiharray {

    public static void main(String[] args) {
        // Inisialisasi array data
        int[] data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000);
        }

        // Mencari nilai tertinggi dan terendah
        int nilaiTertinggi = Arrays.stream(data).max().getAsInt();
        int nilaiTerendah = Arrays.stream(data).min().getAsInt();

        // Menghitung selisih
        int selisih = nilaiTertinggi - nilaiTerendah;

        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Selisih: " + selisih);
    }
}
