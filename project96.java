import java.util.Scanner;

public class project96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        // Bercabang menggunakan if-else
        if (nilai > 90) {
            System.out.println("Nilai Anda sangat baik!");
        } else if (nilai > 70) {
            System.out.println("Nilai Anda baik.");
        } else if (nilai > 50) {
            System.out.println("Anda lulus, perlu belajar lebih keras lagi.");
        } else {
            System.out.println("Anda belum lulus, perlu belajar lebih giat.");
        }

        // Menutup scanner
        scanner.close();
    }
}
