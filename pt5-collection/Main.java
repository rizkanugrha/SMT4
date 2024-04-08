import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        Map<String, String> sosmed = new TreeMap<String, String>();

        String[] data_buku = {
                "Dilan 1990",
                "Laskar Pelangi",
                "Mahaguru",
                "Mengejar Matahari",
                "Dilan 1991",
                "Milea",
                "Perahu Kertas",
                "Laskar Pelangi",
                "Perahu Kertas"
        };

        // soal 1
        System.out.print("========\nSoal 1\n========\n\n");
        int num = 1;
        Func.addSet(set, data_buku);
        System.out.println("Daftar buku secara urut: ");
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            String hasil = (String) iterator.next();
            System.out.println(num + ". " + hasil);
            num++;
        }

        // soal 2
        System.out.print("\n========\nSoal 2\n========");
        String cariBuku = "Mahaguru";
        boolean cek = Func.contains(set, cariBuku);
        int nums = 1;
        if (cek) {
            System.out.println("\n\nBuku " + cariBuku + " ditemukan.");
            System.out.println("\n\nDaftar buku setelah Mahaguru dipinjam: ");
            for (String buku : set) {
                System.out.println(nums + ". " + buku);
                nums++;
            }
        } else {
            System.out.println("\n\nBuku '" + cariBuku + "' tidak ditemukan.");
        }

        System.out.print("\n");

        // soal 3
        System.out.print("========\nSoal 3\n========\n\n");
        int no = 1;
        String[][] arr = {
                { "Microsoft", "Bill Gates" },
                { "Apple", "Steven Paul Jobs" },
                { "Linux", "Linux Benedict Torvalds" },
                { "Facebook", "Mark Zuckerberg" },
                { "Twitter", "Jack Dorsey" },
                { "Instagram", "Kevin Systrom" }
        };

        Func.putData(sosmed, arr);
        for (Map.Entry<String, String> entry : sosmed.entrySet()) {
            System.out.println(no + ". " + entry.getKey().toUpperCase() + " dikembangkan oleh " + entry.getValue());
            no++;
        }

    }

}
