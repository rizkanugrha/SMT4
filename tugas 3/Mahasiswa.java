/*
 * Nama : Rizka Nugraha
 * NIM  : A11.2022.14119
 * Tugas PBO Mhs Enkapsulasi
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public double ipk;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public Mahasiswa(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru) {
        this.nim = nimBaru;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.ipk = ipkBaru;
    }

    /*
     * Jika ipk diantara 2.0 sampai 2.75, kembalikan string “Memuaskan”
     * Jika ipk diantara 2.76 sampai 3.5, kembalikan string ‘Sangat memuaskan”
     * Jika ipk diantara 3.51 sampai 4.0, kembalikan string “Dengan pujian”
     * Jika tidak, kembalikan string “-“
     * 
     */

    public String Predikat(double ipk) {
        if (ipk >= 2.0 && ipk <= 2.75) {
            return "Mamuaskan";
        } else if (ipk >= 2.76 && ipk <= 3.5) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.51 && ipk <= 4.0) {
            return "Dengan Pujian";
        } else {
            return "-";
        }
    }

    public void cetak() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("IPK : " + ipk + " (" + Predikat(ipk) + ")");

    }
}