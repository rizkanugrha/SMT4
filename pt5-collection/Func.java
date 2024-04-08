import java.util.*;

public class Func {
    public static void addSet(TreeSet<String> set, String[] data) {
        for (String d : data) {
            set.add(d);
        }
    }

    public static boolean contains(TreeSet<String> daftarBuku, String cariBuku) {
        // Periksa apakah buku yang dicari ada dalam daftar
        boolean cek = daftarBuku.contains(cariBuku);

        // Jika buku ditemukan, hapus dari daftar
        if (cek) {
            daftarBuku.remove(cariBuku);
        }

        return cek;
    }

    public static void putData(Map<String, String> map, String[][] data) {
        for (String[] d : data) {
            if (d.length >= 2) {
                map.put(d[0], d[1]);
            }
        }
    }

}
