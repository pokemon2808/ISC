import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class project15 {
        public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka (0 untuk berhenti):");

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            queue.add(input);
        }

        System.out.println("Angka-angka yang dimasukkan:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
}
}