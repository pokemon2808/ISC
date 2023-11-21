import java.util.Scanner;

public class project45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar array: ");
        int lebar = input.nextInt();
        System.out.print("Masukkan tinggi array: ");
        int tinggi = input.nextInt();

        // Inisialisasi array 3D
        int[][][] array3D = new int[panjang][lebar][tinggi];

        // Input nilai untuk setiap elemen array
        System.out.println("Masukkan nilai untuk setiap elemen array:");
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                for (int k = 0; k < tinggi; k++) {
                    System.out.print("Masukkan nilai untuk array[" + i + "][" + j + "][" + k + "]: ");
                    array3D[i][j][k] = input.nextInt();
                }
            }
        }

        // Menampilkan isi dari array 3D
        System.out.println("\nIsi dari array 3D:");
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                for (int k = 0; k < tinggi; k++) {
                    System.out.println("Nilai array[" + i + "][" + j + "][" + k + "]: " + array3D[i][j][k]);
                }
            }
        }
    }
}
