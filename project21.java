import java.util.ArrayList;
import java.util.Scanner;
class Segitiga {
    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

public class project21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Segitiga> segitigaList = new ArrayList<>();

        System.out.print("Masukkan jumlah segitiga yang ingin dihitung: ");
        int jumlahSegitiga = scanner.nextInt();

        for (int i = 0; i < jumlahSegitiga; i++) {
            System.out.println("\nSegitiga ke-" + (i + 1));
            System.out.print("Masukkan panjang alas: ");
            double alas = scanner.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = scanner.nextDouble();

            Segitiga segitiga = new Segitiga(alas, tinggi);
            segitigaList.add(segitiga);
        }

        System.out.println("\nHasil Perhitungan Luas Segitiga:");
        for (int i = 0; i < segitigaList.size(); i++) {
            Segitiga segitiga = segitigaList.get(i);
            double luas = segitiga.hitungLuas();
            System.out.println("Luas segitiga ke-" + (i + 1) + ": " + luas);
        }

        scanner.close();
    }
}