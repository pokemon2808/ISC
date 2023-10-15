import java.util.Scanner;

public class project9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah karyawan dari pengguna
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();

        // Meminta jumlah bulan dari pengguna
        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();

        // Inisialisasi variabel untuk menyimpan total gaji
        double totalGaji = 0;

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            System.out.println("Bulan ke-" + bulan);

            for (int i = 1; i <= jumlahKaryawan; i++) {
                // Meminta gaji karyawan ke-i
                System.out.print("Masukkan gaji karyawan ke-" + i + " untuk bulan ini: ");
                double gaji = input.nextDouble();

                // Menambahkan gaji ke totalGaji
                totalGaji += gaji;
            }
        }

        // Menampilkan jumlah karyawan dan total gaji
        System.out.println("Jumlah karyawan: " + jumlahKaryawan);
        System.out.println("Total gaji selama " + jumlahBulan + " bulan: " + totalGaji);

        // Menutup Scanner
        input.close();
    }

}