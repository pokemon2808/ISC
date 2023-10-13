import java.util.Scanner;
public class project7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alas dan tinggi
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        // Hitung luas
        double luas = hitungLuas(alas, tinggi);

        // Tampilkan hasil
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);
    }

    // Metode untuk menghitung luas segitiga
    public static double hitungLuas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}