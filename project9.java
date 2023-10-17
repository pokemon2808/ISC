import java.util.Scanner;

public class project9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();


        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();


        double totalGaji = 0;

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            System.out.println("Bulan ke-" + bulan);

            for (int i = 1; i <= jumlahKaryawan; i++) {

                System.out.print("Masukkan gaji karyawan ke-" + i + " untuk bulan ini: ");
                double gaji = input.nextDouble();
                totalGaji += gaji;
            }
        }

        System.out.println("Jumlah karyawan: " + jumlahKaryawan);
        System.out.println("Total gaji selama " + jumlahBulan + " bulan: " + totalGaji);
        input.close();
    }

}