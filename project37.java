import java.util.Scanner;
public class project37 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = scanner.nextDouble();

        double volume = hitungVolumeBola(jariJari);
        double luasPermukaan = hitungLuasPermukaanBola(jariJari);

        System.out.println("Volume bola: " + volume);
        System.out.println("Luas permukaan bola: " + luasPermukaan);

        scanner.close();
    }

    // Fungsi untuk menghitung volume bola
    public static double hitungVolumeBola(double jariJari) {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    // Fungsi untuk menghitung luas permukaan bola
    public static double hitungLuasPermukaanBola(double jariJari) {
        return 4.0 * Math.PI * Math.pow(jariJari, 2);
    }
}
