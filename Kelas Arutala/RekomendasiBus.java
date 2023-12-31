import java.util.Arrays;
import java.util.List;

public class RekomendasiBus {
    public static void main(String[] args) {

        private static final List<Bus> BUSSES = Arrays.asList(
                new Bus(60, 2300000),
                new Bus(45, 2000000),
                new Bus(32, 1800000),
                new Bus(18, 1500000),
                new Bus(12, 1300000));

        int n = Integer.parseInt(args[0]);

        // Inisialisasi harga bus termurah
        int hargaTermurah = Integer.MAX_VALUE;

        // Periksa semua bus
        for (Bus bus : BUSSES) {
            // Jika bus dapat menampung penumpang, periksa harganya
            if (n <= bus.getKapasitas()) {
                // Jika harga bus lebih murah dari harga bus termurah, perbarui harga bus
                // termurah
                if (bus.getHarga() < hargaTermurah) {
                    hargaTermurah = bus.getHarga();
                }
            }
        }

        // Cetak harga bus termurah
        System.out.println(hargaTermurah);
    }

    private static class Bus {

        private final int kapasitas;
        private final int harga;

        public Bus(int kapasitas, int harga) {
            this.kapasitas = kapasitas;
            this.harga = harga;
        }

        public int getKapasitas() {
            return kapasitas;
        }

        public int getHarga() {
            return harga;
        }
    }
}