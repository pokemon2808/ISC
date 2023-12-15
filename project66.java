import java.util.Scanner;
import java.util.Stack;

public class project66 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan beberapa bilangan bulat ke dalam stack (Ketik 'selesai' untuk berhenti):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                stack.push(number);
            } catch (NumberFormatException e) {
                System.out.println("Format salah. Masukkan bilangan bulat atau ketik 'selesai' untuk berhenti.");
            }
        }

        System.out.println("Isi stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
