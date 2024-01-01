import java.util.Scanner;

public class project81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan panjang dan lebar jajargenjang
        System.out.print("Masukkan panjang jajargenjang: ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan lebar jajargenjang: ");
        double lebar = input.nextDouble();

        // Menghitung luas dan keliling jajargenjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Menampilkan hasil
        System.out.println("Luas jajargenjang: " + luas);
        System.out.println("Keliling jajargenjang: " + keliling);

        input.close();
    }
}
