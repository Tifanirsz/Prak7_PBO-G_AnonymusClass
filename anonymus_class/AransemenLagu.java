package anonymus_class;

// Interface Instrumen
interface Instrumen {
    void mainkan(String judulLagu);
}

// Class utama AransemenLagu
public class AransemenLagu {

    // Atribut judul lagu
    private String judulLagu;

    // Konstruktor
    public AransemenLagu(String judulLagu) {
        this.judulLagu = judulLagu;
    }

    // Method aturAransemen()
    public void aturAransemen() {

        // Instrumen 1 - Piano (Anonymous Class)
        Instrumen piano = new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Piano memainkan \"" + judulLagu +
                        "\" dengan melodi lembut (Tempo 80 BPM)");
            }
        };

        // Instrumen 2 - Gitar (Anonymous Class)
        Instrumen gitar = new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Gitar memainkan \"" + judulLagu +
                        "\" dengan ritme cepat (Tempo 120 BPM)");
            }
        };

        // Instrumen 3 - Drum (Anonymous Class)
        Instrumen drum = new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Drum memainkan \"" + judulLagu +
                        "\" dengan ketukan dinamis (Tempo 100 BPM)");
            }
        };

        // Menyimpan objek ke array
        Instrumen[] arr = { piano, gitar, drum };

        // Menampilkan hasil pemanggilan mainkan()
        System.out.println("=== ARANSEMEN LAGU: " + judulLagu + " ===");
        for (Instrumen i : arr) {
            i.mainkan(judulLagu);
        }
    }

    // Method improvisasi()
    public void improvisasi(Instrumen instrumenImprovisasi) {
        System.out.println("\n=== IMPROVISASI ===");
        instrumenImprovisasi.mainkan(judulLagu);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {

        AransemenLagu ar = new AransemenLagu("Senandung Malam");

        ar.aturAransemen();

        // Anonymous class improvisasi
        ar.improvisasi(new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Biola memainkan improvisasi \"" +
                        judulLagu +
                        "\" dengan nada tinggi dan tempo 90 BPM");
            }
        });
    }
}