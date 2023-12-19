import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Karyawan {
    private String nama;
    private int usia;

    public Karyawan(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }
}

public class project70 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukkan jumlah karyawan:");
        int jumlahKaryawan = Integer.parseInt(br.readLine());

        Karyawan[] karyawanArray = new Karyawan[jumlahKaryawan];

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("Masukkan nama karyawan ke-" + (i + 1) + ":");
            String nama = br.readLine();

            System.out.println("Masukkan usia karyawan ke-" + (i + 1) + ":");
            int usia = Integer.parseInt(br.readLine());

            karyawanArray[i] = new Karyawan(nama, usia);
        }

        System.out.println("\nDaftar Karyawan:");
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("Karyawan ke-" + (i + 1) + ":");
            System.out.println("Nama: " + karyawanArray[i].getNama());
            System.out.println("Usia: " + karyawanArray[i].getUsia());
            System.out.println();
        }
    }
}
