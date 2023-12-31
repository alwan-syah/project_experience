import java.util.Scanner;

public class ParkirMall {
	public static void main(String[] args) {
		// menghitung tarif parkir tarifJamPertama + (tarifPerjam * (lamaParkir -1)),
		// divalidasi dengan tarif maksimal.

		Scanner input = new Scanner(System.in);
		int jenisKendaraan = 0;
		int lamaParkir = 0;

		// menentukan jenis kendaraan
		String[] listJenisKendaraan = { "Mobil", "Motor", "Box", "Bis", "Sepeda" };

		// menentukan data tarif jam pertama
		int[] listTarifJamPertamaKendaraan = { 5000, 2000, 10000, 25000, 1000 };

		// menentukan data tarif per jam
		int[] listTarifPerjam = { 2000, 1000, 5000, 7500, 250 };

		// menentukan data tarif maksimal
		int[] listTarifMaksimal = { 25000, 10000, 50000, 125000, 5000 };

		int tarifJamPertama = 0;
		int tarifPerJam = 0;
		int maksimalTarif = 0;
		int totalParkir = 0;

		boolean isLooping = true;

		do {
			isLooping = true;

			// input user
			System.out.println("Input Jenis Kendaraan : ");
			jenisKendaraan = Integer.valueOf(input.nextLine());// nextLine() untuk string
			jenisKendaraan = input.nextLine();

					System.out.println("Input lama Parkir : ");
			lamaParkir = Integer.valueOf(input.nextLine());

			if (!(lamaParkir > 0 && lamaParkir <= 24)) {
				System.out.println("Input Error !!!");
			} else {
				// menampilkan test dari function yang sudah saya buat.

				// Menentukan tarif Jam Pertama Berdasarkan Jenis Kendaraan
				tarifJamPertama = getTarifJamPertama(listTarifJamPertamaKendaraan, jenisKendaraan);

				System.out.println("Tarif pertama " + tarifJamPertama);

				// Menentukan tarif per jam berdasarkan jenis kendaraan
				tarifPerJam = getTarifPerjam(listTarifPerjam, jenisKendaraan);

				System.out.println("Tarif perjam " + tarifPerJam);

				// menentukan tarif maksimal
				maksimalTarif = getTarifMaksimal(listTarifMaksimal, jenisKendaraan);

				System.out.println("Tarif Maksimal : " + maksimalTarif);

				// menghitung biaya parkir
				totalParkir = hitungBiayaParkir(tarifJamPertama, tarifPerJam, maksimalTarif, lamaParkir);

				System.out.println("Total Biaya Parkir : " + totalParkir);

				System.out.println("\nApakah akan menghitung biaya lainnya? (y/t)");
				String pilihan = input.nextLine();

				if (pilihan.equalsIgnoreCase("T")) {
					isLooping = false;
				}

			}

		} while (isLooping);

	}

	// membuat function untuk menentukan tarif jam pertama berdasarkan jenis
	// kendaraan

	public static int getTarifJamPertama(int[] arrTarifJamPertama, int jenisKendaraan) {
		int result = 0;

		result = arrTarifJamPertama[jenisKendaraan - 1];

		return result;
	}

	public static int getTarifPerjam(int[] arrTarifPerjam, int jenisKendaraan) {
		int result = 0;

		result = arrTarifPerjam[jenisKendaraan - 1];

		return result;
	}

	public static int getTarifMaksimal(int[] arrTarifMaksimal, int jenisKendaraan) {
		int result = 0;

		result = arrTarifMaksimal[jenisKendaraan - 1];

		return result;
	}

	public static int hitungBiayaParkir(int tarifJamPertama, int tarifPerjam, int maksimalTarif, int lamaParkir) {
		int biayaParkir = 0;

		biayaParkir = tarifJamPertama + (tarifPerjam * (lamaParkir - 1));

		// validasi maksimal tarif
		if (biayaParkir > maksimalTarif) {
			biayaParkir = maksimalTarif;
		}

		return biayaParkir;
	}

}
