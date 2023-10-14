import java.util.Scanner;

public class project8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
    }

    public static double hitungLuasPermukaan(double sisi) {
        double luas = 6 * sisi * sisi;
        return luas;
    }
}