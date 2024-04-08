import java.util.Scanner;

public class MenghitungNilai {

    public static void main(String[] args) {

        try (// Buat Objek Scanner

                Scanner input = new Scanner(System.in)) {
            // Prompt Input
            System.out.println("Masukkan nim: ");
            String nim = input.nextLine();

            System.out.println("Masukkan nama: ");
            String nama = input.nextLine();

            System.out.println("Masukkan nilai tugas: ");
            double nilaiTugas = input.nextDouble();

            System.out.println("Masukkan nilai uts: ");
            double nilaiUts = input.nextDouble();

            System.out.println("Masukkan nilai uas: ");
            double nilaiUas = input.nextDouble();

            HitungNilai hitungNilai = new HitungNilai(nim, nama, nilaiTugas, nilaiUts, nilaiUas);
            hitungNilai.hitungNilaiakhir();
            hitungNilai.cetakNilai();
        }

    }
}

class HitungNilai {
    String nim;
    String nama;
    double nilaiUts;
    double nilaiTugas;
    double nilaiUas;
    double pNilaiUts;
    double pNilaiTugas;
    double pNilaiUas;
    double hasilTugas;
    double hasilUTS;
    double hasilUAS;
    double nilaiAkhir;

    public HitungNilai(String nim, String nama, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        this.pNilaiTugas = 0.2;
        this.pNilaiUts = 0.35;
        this.pNilaiUas = 0.45;
    }

    public double hitungNilaiakhir() {
        this.hasilTugas = nilaiTugas * pNilaiTugas;
        this.hasilUTS = nilaiUts * pNilaiUts;
        this.hasilUAS = nilaiUas * pNilaiUas;
        return nilaiAkhir = hasilTugas + hasilUTS + hasilUAS;
    }

    public void cetakNilai() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Tugas: " + nilaiTugas + " 20%" + ": " + hasilTugas);
        System.out.println("Nilai UTS: " + nilaiUts + " 35%" + ": " + hasilUTS);
        System.out.println("Nilai UAS: " + nilaiUas + " 45%" + ": " + hasilUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }

}
