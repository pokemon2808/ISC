import java.util.Scanner;

public class project03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jam kerja: ");
        int jamKerja = input.nextInt();

        System.out.print("Masukkan tarif per jam: ");
        double tarifPerJam = input.nextDouble();

        // Menghitung gaji
        double gaji = jamKerja * tarifPerJam;

        // Menampilkan hasil
        System.out.println("\nInformasi Karyawan:");
        System.out.println("Nama: " + nama);
        System.out.println("Jam Kerja: " + jamKerja);
        System.out.println("Tarif Per Jam: " + tarifPerJam);
        System.out.println("Gaji: " + gaji);
    }
}