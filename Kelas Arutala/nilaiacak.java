import javax.swing.JOptionPane;
import javax.swing.JTextArea;

// Deklarasi kelas
public class nilaiacak {

    // Metoda main
    public static void main(String[] args) {

        JTextArea areaTampilan;
        int nilaiAcak;

        String deretNilai = "40 Nilai Integer Acak\nDengan Rentang Nilai 20 - 44\n\n";

        // Membuat obyek dari kelas JTextArea
        areaTampilan = new JTextArea();

        for (int a = 1; a <= 3000; a++) {

            nilaiAcak = 1 + (int) (Math.random() * 25);
            deretNilai += nilaiAcak + " ";

            if ((a % 10 == 0) && (a % 2 == 0))
                deretNilai += "\n";

        }

        areaTampilan.setText(deretNilai);

        JOptionPane.showMessageDialog(null, areaTampilan, "Nilai Integer Acak",
                JOptionPane.INFORMATION_MESSAGE);

        // Mengakhiri aplikasi GUI
        System.exit(0);

    }
}
