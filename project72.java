import java.util.ArrayList;
import java.util.Scanner;

class project72 {
    private String nama;
    private double gaji;
    private int bulanMasuk;

    public Karyawan(String nama, double gaji, int bulanMasuk) {
        this.nama = nama;
        this.gaji = gaji;
        this.bulanMasuk = bulanMasuk;
    }

    public double hitungTotalGaji(int bulanSekarang) {
        int jumlahBulan = bulanSekarang - bulanMasuk + 1;
        return gaji * jumlahBulan;
    }

    public String getNama() {
        return nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = scanner.nextInt();

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("\nMasukkan data untuk karyawan ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            scanner.nextLine(); // Membersihkan buffer
            String nama = scanner.nextLine();
            System.out.print("Gaji per bulan: ");
            double gaji = scanner.nextDouble();
            System.out.print("Bulan masuk (1-12): ");
            int bulanMasuk = scanner.nextInt();

            Karyawan karyawan = new Karyawan(nama, gaji, bulanMasuk);
            daftarKaryawan.add(karyawan);
        }

        System.out.print("\nMasukkan bulan sekarang (1-12): ");
        int bulanSekarang = scanner.nextInt();

        double totalGajiKeseluruhan = 0;
        System.out.println("\nDaftar karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println("Nama: " + karyawan.getNama());
            double totalGaji = karyawan.hitungTotalGaji(bulanSekarang);
            totalGajiKeseluruhan += totalGaji;
            System.out.println("Total gaji sampai bulan " + bulanSekarang + ": " + totalGaji);
        }

        System.out.println("\nTotal gaji keseluruhan untuk " + jumlahKaryawan + " karyawan sampai bulan " + bulanSekarang + ": " + totalGajiKeseluruhan);
        System.out.println("Jumlah karyawan yang menerima gaji: " + jumlahKaryawan);
        scanner.close();
    }
}
