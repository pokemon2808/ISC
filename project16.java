import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class project16 {
    public static void main(String[] args) {
        Queue<String> inputQueue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Queue<String> queue1 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Memasukkan data ke dalam Stack
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan data untuk Stack: ");
            String data = scanner.nextLine();
            stack.push(data);
        }

        // Memasukkan data ke dalam Queue
        while (true) {
            System.out.print("Masukkan data untuk queue (ketik 'selesai' untuk berhenti): ");
            String data = scanner.nextLine();
            if (data.equals("selesai")) {
                break;
            }
            stack.push(data);
        }

        // Menampilkan data dari Stack
        System.out.println("\nData dari Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Menampilkan data dari Queue
        System.out.println("\nData dari Queue:");
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }
            }
        }
