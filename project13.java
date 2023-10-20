import java.util.Scanner;
import java.util.Stack;

public class project13 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> inputStack = new Stack<>();

        System.out.println("Masukkan data (ketik 'selesai' untuk berhenti):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("selesai")) {
                break;
            }

            inputStack.push(input);
        }

        System.out.println("\nData yang dimasukkan:");

        while (!inputStack.isEmpty()) {
            System.out.println(inputStack.pop());
        }
    }
}
