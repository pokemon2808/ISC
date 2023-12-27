import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class project77 {
    public static void main(String[] args) {
        // Membuat objek HashMap untuk menyimpan indeks nama kota
        Map<String, Integer> indeksKota = new HashMap<>();

        // Mengisi HashMap dengan beberapa nama kota
        indeksKota.put("Jakarta", 1);
        indeksKota.put("Surabaya", 2);
        indeksKota.put("Bandung", 3);
        indeksKota.put("Yogyakarta", 4);
        indeksKota.put("Medan", 5);

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama kota
        System.out.print("Masukkan nama kota: ");
        String namaKota = scanner.nextLine();

        // Mencari indeks nama kota dalam HashMap
        Integer indeks = indeksKota.get(namaKota);

        // Menampilkan hasil pencarian
        if (indeks != null) {
            System.out.println("Indeks untuk kota " + namaKota + " adalah " + indeks);
        } else {
            System.out.println("Kota " + namaKota + " tidak ditemukan dalam indeks.");
        }

        // Menutup Scanner
        scanner.close();
    }
}
