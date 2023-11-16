import java.util.Scanner;
public class project40 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di program penghitungan luas bangunan gedung");
        System.out.println("Silakan pilih bentuk bangunan:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.print("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = input.nextInt();

        double luas = 0.0;

        if (pilihan == 1) {
            System.out.print("Masukkan panjang bangunan (meter): ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar bangunan (meter): ");
            double lebar = input.nextDouble();

            // Menghitung luas persegi panjang
            luas = panjang * lebar;
            System.out.println("Luas bangunan persegi panjang adalah: " + luas + " meter persegi");
        } else if (pilihan == 2) {
            System.out.print("Masukkan alas segitiga (meter): ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga (meter): ");
            double tinggi = input.nextDouble();

            // Menghitung luas segitiga
            luas = 0.5 * alas * tinggi;
            System.out.println("Luas bangunan segitiga adalah: " + luas + " meter persegi");
        } else {
            System.out.println("Pilihan tidak valid");
        }

        input.close();
    }
}


