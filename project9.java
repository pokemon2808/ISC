import java.util.Scanner;

public class project9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
<<<<<<< HEAD

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();


        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();


=======
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();

        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();

>>>>>>> e74b151179f9051ead436791b6598107d59c676d
        double totalGaji = 0;

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            System.out.println("Bulan ke-" + bulan);

            for (int i = 1; i <= jumlahKaryawan; i++) {

                System.out.print("Masukkan gaji karyawan ke-" + i + " untuk bulan ini: ");
                double gaji = input.nextDouble();
<<<<<<< HEAD
=======

>>>>>>> e74b151179f9051ead436791b6598107d59c676d
                totalGaji += gaji;
            }
        }

        System.out.println("Jumlah karyawan: " + jumlahKaryawan);
        System.out.println("Total gaji selama " + jumlahBulan + " bulan: " + totalGaji);
        input.close();
    }

}
