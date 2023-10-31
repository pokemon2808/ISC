import java.util.Scanner;

public class project24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = scanner.nextDouble();

        double luas = hitungLuasKerucut(jariJari, tinggi);

        System.out.println("Luas kerucut adalah: " + luas);
    }

    public static double hitungLuasKerucut(double jariJari, double tinggi) {
        double luasAlas = Math.PI * jariJari * jariJari;
        double sisiMiring = Math.sqrt(jariJari * jariJari + tinggi * tinggi);
        double luasPermukaan = Math.PI * jariJari * (jariJari + sisiMiring);
        return luasAlas + luasPermukaan;
    }
}
