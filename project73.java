import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    private String nama;
    private int jumlah;

    public Barang(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

class PengelolaInventaris {
    private ArrayList<Barang> inventaris;

    public PengelolaInventaris() {
        inventaris = new ArrayList<>();
    }

    public void tambahBarang(String nama, int jumlah) {
        inventaris.add(new Barang(nama, jumlah));
        System.out.println("Barang berhasil ditambahkan ke inventaris: " + nama + " (Jumlah: " + jumlah + ")");
    }

    public void tampilkanInventaris() {
        if (inventaris.isEmpty()) {
            System.out.println("Inventaris kosong.");
            return;
        }

        System.out.println("Inventaris:");
        for (Barang barang : inventaris) {
            System.out.println(barang.getNama() + " - Jumlah: " + barang.getJumlah());
        }
    }

    public void updateJumlah(String nama, int jumlahBaru) {
        for (Barang barang : inventaris) {
            if (barang.getNama().equalsIgnoreCase(nama)) {
                barang.setJumlah(jumlahBaru);
                System.out.println("Jumlah barang " + nama + " berhasil diperbarui (Jumlah Baru: " + jumlahBaru + ")");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan di inventaris: " + nama);
    }
}

public class SistemManajemenInventaris {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PengelolaInventaris pengelola = new PengelolaInventaris();

        while (true) {
            System.out.println("\n===== Sistem Manajemen Inventaris =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Inventaris");
            System.out.println("3. Perbarui Jumlah");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Masukkan jumlah: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline
                    pengelola.tambahBarang(namaBarang, jumlah);
                    break;
                case 2:
                    pengelola.tampilkanInventaris();
                    break;
                case 3:
                    System.out.print("Masukkan nama barang untuk diperbarui jumlahnya: ");
                    String barangToUpdate = scanner.nextLine();
                    System.out.print("Masukkan jumlah baru: ");
                    int jumlahBaru = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline
                    pengelola.updateJumlah(barangToUpdate, jumlahBaru);
                    break;
                case 4:
                    System.out.println("Keluar... Terima kasih!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid! Mohon masukkan pilihan yang benar.");
            }
        }
    }
}
