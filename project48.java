import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class project48{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int bilangan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan elemen ke dalam Queue");
            System.out.println("2. Hapus elemen dari depan Queue");
            System.out.println("3. Cetak isi dari Queue");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi yang diinginkan (1-4): ");
            bilangan = scanner.nextInt();

            switch (bilangan) {
                case 1:
                    System.out.print("Masukkan elemen yang ingin ditambahkan ke dalam Queue: ");
                    int element = scanner.nextInt();
                    queue.offer(element); 
                    System.out.println("Elemen " + element + " telah ditambahkan ke dalam Queue.");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        int removedElement = queue.poll();
                        System.out.println("Elemen " + removedElement + " telah dihapus dari Queue.");
                    } else {
                        System.out.println("Queue kosong. Tidak ada elemen yang dapat dihapus.");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Isi dari Queue:");
                        for (int item : queue) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Queue kosong. Tidak ada elemen untuk dicetak.");
                    }
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Masukkan tidak valid. Silakan pilih operasi yang benar (1-4).");
                    break;
            }
        } while (bilangan != 4);

        scanner.close();
    }
}
