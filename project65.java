import java.util.Scanner;

public class project65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        // Inisialisasi array
        int[] arr = new int[n];

        // Input nilai untuk setiap elemen array
        System.out.println("Masukkan nilai untuk setiap elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Menampilkan nilai array
        System.out.println("Nilai array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Elemen ke-" + i + ": " + arr[i]);
        }

        // Menghitung rata-rata
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = (double) sum / n;

        System.out.println("Rata-rata: " + average);

        // Menutup scanner
        scanner.close();
    }
}
