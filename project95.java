import java.util.ArrayList;
import java.util.Scanner;

class Karyawan {
    private int id;
    private String nama;
    private int usia;
    private double gaji;

    public Karyawan(int id, String nama, int usia, double gaji) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.gaji = gaji;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}

public class UpdateKaryawan {
    private static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

    public static void main(String[] args) {
        tambahDataKaryawan();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID Karyawan yang akan diupdate: ");
        int idToUpdate = scanner.nextInt();

        Karyawan karyawanToUpdate = cariKaryawanById(idToUpdate);

        if (karyawanToUpdate != null) {
            System.out.println("Data Karyawan yang akan diupdate:");
            tampilkanDetailKaryawan(karyawanToUpdate);

            System.out.print("Masukkan gaji baru: ");
            double gajiBaru = scanner.nextDouble();

            karyawanToUpdate.setGaji(gajiBaru);

            System.out.println("Data Karyawan berhasil diupdate:");
            tampilkanDetailKaryawan(karyawanToUpdate);
        } else {
            System.out.println("Karyawan dengan ID " + idToUpdate + " tidak ditemukan.");
        }
    }

    private static void tambahDataKaryawan() {
        // Menambahkan beberapa data karyawan ke dalam daftar
        daftarKaryawan.add(new Karyawan(1, "John Doe", 25, 50000.0));
        daftarKaryawan.add(new Karyawan(2, "Jane Smith", 30, 60000.0));
        daftarKaryawan.add(new Karyawan(3, "Bob Johnson", 28, 55000.0));
    }

    private static Karyawan cariKaryawanById(int id) {
        for (Karyawan karyawan : daftarKaryawan) {
            if (karyawan.getId() == id) {
                return karyawan;
            }
        }
        return null;
    }

    private static void tampilkanDetailKaryawan(Karyawan karyawan) {
        System.out.println("ID: " + karyawan.getId());
        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Usia: " + karyawan.getUsia());
        System.out.println("Gaji: " + karyawan.getGaji());
    }
}
