import java.util.Random;

public class project71{
    public static void main(String[] args) {
        // Membuat objek dari kelas Random
        Random random = new Random();

        // Menghasilkan angka acak antara 1 dan 100
        int angkaAcak = random.nextInt(100) + 1;

        // Menampilkan angka acak
        System.out.println("Angka acak: " + angkaAcak);
    }
}
