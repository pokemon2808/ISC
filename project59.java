import java.util.Scanner;

public class project59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan koordinat x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Masukkan koordinat y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Masukkan koordinat x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Masukkan koordinat y2: ");
        double y2 = scanner.nextDouble();

        // Menghitung jarak antara dua titik menggunakan rumus Euclidean distance
        double jarak = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Jarak antara kedua titik: " + jarak);

        scanner.close();
    }
}
