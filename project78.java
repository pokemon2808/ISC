import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class project78 {
    public static void main(String[] args) {
        // Membuat objek HashMap untuk menyimpan indeks nama kelas
        Map<String, Integer> indeksKelas = new HashMap<>();

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Memasukkan data nama kelas secara manual sebagai contoh
        indeksKelas.put("Matematika", 101);
        indeksKelas.put("Fisika", 102);
        indeksKelas.put("Biologi", 103);
        indeksKelas.put("Kimia", 104);

        // Memasukkan data nama kelas dari pengguna
        System.out.print("Masukkan nama kelas: ");
        String namaKelas = scanner.nextLine();

        // Memeriksa apakah nama kelas sudah ada di indeks
        if (indeksKelas.containsKey(namaKelas)) {
            System.out.println("Indeks untuk kelas " + namaKelas + " adalah " + indeksKelas.get(namaKelas));
        } else {
            // Meminta pengguna memasukkan indeks jika nama kelas belum ada
            System.out.print("Masukkan indeks untuk kelas " + namaKelas + ": ");
            int indeks = scanner.nextInt();

            // Menambahkan nama kelas dan indeksnya ke HashMap
            indeksKelas.put(namaKelas, indeks);
            System.out.println("Kelas " + namaKelas + " dengan indeks " + indeks + " berhasil ditambahkan.");
        }

        // Menutup Scanner
        scanner.close();
    }
}
