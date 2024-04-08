import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukan NIM : ");
            String nimBaru = input.nextLine();
            System.out.println("Masukan Nama : ");
            String namaBaru = input.nextLine();
            System.out.println("Masukan Alamat :");
            String alamatBaru = input.nextLine();
            System.out.println("Masukan IPK :");
            double ipkBaru = input.nextDouble();

            Mahasiswa mhs = new Mahasiswa(nimBaru, namaBaru, alamatBaru, ipkBaru);
            System.out.println("\nOutput : ");
            mhs.cetak();

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

/*
 * Nama : Rizka Nugraha
 * NIM : A11.2022.14119
 * Tugas PBO Mhs Enkapsulasi
 */