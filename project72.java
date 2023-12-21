import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class project72 {
    public static void main(String[] args) {
        Queue<Integer> numbersQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan beberapa nilai (ketikkan 'selesai' untuk mengakhiri):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbersQueue.offer(number); // Memasukkan nilai ke dalam queue
            } catch (NumberFormatException e) {
                System.out.println("Masukkan nilai yang valid atau ketik 'selesai' untuk mengakhiri.");
            }
        }

        int total = calculateTotal(numbersQueue);
        System.out.println("Hasil penjumlahan: " + total);

        scanner.close();
    }

    private static int calculateTotal(Queue<Integer> numbersQueue) {
        int total = 0;

        while (!numbersQueue.isEmpty()) {
            total += numbersQueue.poll(); // Mengeluarkan dan menghitung nilai dari queue
        }

        return total;
    }
}
