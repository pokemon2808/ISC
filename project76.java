import java.util.ArrayList;
import java.util.Scanner;

public class project76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen untuk dimensi pertama: ");
        int dimensi1 = scanner.nextInt();

        System.out.print("Masukkan jumlah elemen untuk dimensi kedua: ");
        int dimensi2 = scanner.nextInt();

        System.out.print("Masukkan jumlah elemen untuk dimensi ketiga: ");
        int dimensi3 = scanner.nextInt();

        // Membuat ArrayList 3 dimensi
        ArrayList<ArrayList<ArrayList<Integer>>> arrayList3D = new ArrayList<>();

        // Inisialisasi array
        for (int i = 0; i < dimensi1; i++) {
            arrayList3D.add(new ArrayList<>());
            for (int j = 0; j < dimensi2; j++) {
                arrayList3D.get(i).add(new ArrayList<>());
                for (int k = 0; k < dimensi3; k++) {
                    System.out.print("Masukkan nilai untuk indeks [" + i + "][" + j + "][" + k + "]: ");
                    int nilai = scanner.nextInt();
                    arrayList3D.get(i).get(j).add(nilai);
                }
            }
        }

        // Menampilkan isi dari ArrayList 3 dimensi
        System.out.println("\nIsi dari ArrayList 3 dimensi:");
        for (int i = 0; i < dimensi1; i++) {
            for (int j = 0; j < dimensi2; j++) {
                for (int k = 0; k < dimensi3; k++) {
                    System.out.println("Nilai indeks [" + i + "][" + j + "][" + k + "]: " +
                            arrayList3D.get(i).get(j).get(k));
                }
            }
        }

        scanner.close();
    }
}
