
import java.util.Scanner;
public class NilaiDemo {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
    String ulangi;
    //Buat Array daftarNilai untuk menampung semua property inputan Nilai[] daftarNilai = new Nilai[100];
    //jumlahData berfungsi sebagai indexing
    
    Nilai[] daftarNilai = new Nilai[100];
    int jumlahData = 0;
    //jumlahData berfungsi sebagai indexing int jumlahData = 0;
    do{
    // Input Data
    System.out.println("===========");
    
    System.out.println("Program Menghitung Nilai Mahasiswa");
    System.out.println("===========");
    
    //instance object
    Nilai nilai = new Nilai();
    nilai.isiData();
    nilai.hitungNilai();
    nilai.cetakNilai();
    //Masukan object nilai ke dalam array daftarNilai daftarNilai[jumlahData] = nilai; jumlahData++;
    daftarNilai[jumlahData] = nilai;
    jumlahData++;
    System.out.println("Apakah masih ingin hitung nilai[Y/N]: "); 
    ulangi = sc.nextLine();
    } while (ulangi.equalsIgnoreCase("Y"));
    Nilai.daftarNilai(daftarNilai, jumlahData);
    }
    }
}

// Panggil Static Method untuk mencetak daftar Nilai Nilai.daftarNilai(daftarNilai, jumlahData);