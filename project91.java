import java.util.Scanner;
import java.util.Vector;

public class project91 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();

        System.out.println("Masukkan beberapa angka (ketik 'selesai' untuk mengakhiri): ");

        while (true) {
            String userInput = input.next();

            if (userInput.equals("selesai")) {
                break;
            }

            try {
                int number = Integer.parseInt(userInput);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Masukkan tidak valid. Silakan masukkan angka atau ketik 'selesai' untuk mengakhiri.");
            }
        }

        System.out.println("Angka yang dimasukkan: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
