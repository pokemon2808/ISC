import java.util.Scanner;

class Mahasiswa {
    String nama;
    int usia;

    // Konstruktor untuk menginisialisasi objek
    public Mahasiswa(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Fungsi untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
    }
}
public class project36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minta pengguna memasukkan informasi mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Masukkan usia mahasiswa: ");
        int usiaMahasiswa = scanner.nextInt();

        // Buat objek Mahasiswa dengan informasi yang dimasukkan pengguna
        Mahasiswa mahasiswa1 = new Mahasiswa(namaMahasiswa, usiaMahasiswa);

        // Tampilkan informasi mahasiswa
        System.out.println("\nInformasi Mahasiswa:");
        mahasiswa1.tampilkanInfo();

        // Tutup objek Scanner
        scanner.close();
    }
}
