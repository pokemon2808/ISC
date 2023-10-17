import java.util.ArrayList;
import java.util.Scanner;

public class project11 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan nama-nama
        ArrayList<String> names = new ArrayList<>();

        // Membuat scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama-nama
        System.out.println("Masukkan beberapa nama (ketik 'selesai' untuk berhenti):");

        while (true) {
            String input = scanner.nextLine();

            // Jika pengguna memasukkan 'selesai', keluar dari loop
            if (input.equals("selesai")) {
                break;
            }

            // Menambahkan nama ke ArrayList
            names.add(input);
        }

        // Menampilkan isi ArrayList
        System.out.println("Nama-nama yang dimasukkan:");
        for (String name : names) {
            System.out.println(name);
        }

        // Menutup scanner
        scanner.close();
    }
}