import java.util.Scanner;

public class project6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin diperiksa: ");
        int jumlah = scanner.nextInt();

        int jumlahGanjil = 0;
        int jumlahGenap = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int angka = scanner.nextInt();

            if (angka % 2 == 0) {
                System.out.println(angka + " adalah bilangan genap.");
                jumlahGenap++;
            } else {
                System.out.println(angka + " adalah bilangan ganjil.");
                jumlahGanjil++;
            }
        }

        System.out.println("Jumlah angka ganjil: " + jumlahGanjil);
        System.out.println("Jumlah angka genap: " + jumlahGenap);
    }
}