import java.util.Scanner;

public class Nilai {
    String nim, nama, predikat;
    float tgs, uts, uas, pUts, pTgs, pUas, nakh;
    char nHuruf;
    Scanner sc = new Scanner(System.in);

    public Nilai(String nim, String nama, float tgs, float uts, float uas) {
        this.nim = nim;
        this.nama = nama;
        this.tgs = tgs;
        this.uas = uas;
        this.uts = uts;
    }

    public Nilai() {

    }

    void isiData() {
        System.out.println("masukan nim :");
        nim = sc.next();
        System.out.println("masukan nama :");
        nama = sc.next();
        System.out.println("masukan nilai tgs :");
        tgs = sc.nextFloat();
        System.out.println("masukan nilai uts :");
        uts = sc.nextFloat();
        System.out.println("masukan nilai uas :");
        uas = sc.nextFloat();
    }

    void hitungNilai() { // 30, 35 35
        pTgs = 0.3f * tgs;
        pUts = 0.35f * uts;
        pUas = 0.35f * uas;
        nakh = pTgs + pUts + pUas;
    }

    char getNilHuruf(float nilai) {
        if (nilai >= 85) {
            return nHuruf = 'A';
        } else if (nilai >= 70 && nilai < 85) {
            return nHuruf = 'B';
        } else if (nilai >= 60 && nilai < 70) {
            return nHuruf = 'C';
        } else if (nilai >= 40 && nilai < 60) {
            return nHuruf = 'D';
        } else {
            return nHuruf = 'E';
        }
    }

    String getPredikat(char huruf) {
        switch (huruf) {
            case 'A':
                predikat = "Apik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Dablek";
                break;
            case 'E':
                predikat = "Elek";
                break;
        }
        return predikat;
    }

    void cetakNilai() {
        hitungNilai(); // Calculate nilai before printing
        System.out.println("Nim             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("tugas           : " + tgs + " : " + pTgs);
        System.out.println("uts             : " + uts + " : " + pUts);
        System.out.println("uas             : " + uas + " : " + pUas);
        System.out.println("Nilai AKhir     : " + nakh);
        System.out.println("Nilai Huruf     : " + getNilHuruf(nakh));
        System.out.println("Predikat        : " + getPredikat(getNilHuruf(nakh)));
    }

    public static void daftarNilai(Nilai[] daftarNilai, int jumlahData) {
        System.out.println("================================");
        System.out.println("Daftar Nilai Mahasiswa :");
        System.out.println("================================");
        System.out.println("No\tNIM\tNama\tNilai Akhir\tNilai Huruf\tPredikat");
        for (int i = 0; i < jumlahData; i++) {
            Nilai nilai = daftarNilai[i];
            System.out.printf("%d\t%s\t%s\t%.2f\t\t%c\t\t%s\n",
                    i + 1, nilai.nim, nilai.nama, nilai.nakh, nilai.getNilHuruf(nilai.nakh),
                    nilai.getPredikat(nilai.getNilHuruf(nilai.nakh)));
        }
    }
}
