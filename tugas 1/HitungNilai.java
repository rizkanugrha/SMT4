
public class HitungNilai {
    private String nim;
    private String nama;
    private double nilaiUts;
    private double nilaiTugas;
    private double nilaiUas;
    private double pNilaiUts;
    private double pNilaiTugas;
    private double pNilaiUas;
    private double hasilTugas;
    private double hasilUTS;
    private double hasilUAS;
    private double nilaiAkhir;

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
