import java.util.Scanner;

public class mainHitung {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         System.out.print("Masukkan NIM : ");
         String nim = input.nextLine();
         System.out.print("Masukkan Nama : ");
         String nama = input.nextLine();
         System.out.print("Masukkan Nilai Tugas : ");
         double nilaiTugas = input.nextDouble();
         System.out.print("Masukkan Nilai UTS : ");
         double nilaiUTS = input.nextDouble();
         System.out.print("Masukkan Nilai UAS : ");
         double nilaiUAS = input.nextDouble();

         HitungNilai hitungNilai = new HitungNilai(nim, nama, nilaiTugas, nilaiUTS, nilaiUAS);
         hitungNilai.hitungNilaiakhir();
         hitungNilai.cetakNilai();
      }
   }
}