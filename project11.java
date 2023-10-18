import java.util.ArrayList;
import java.util.Scanner;

public class project11 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan beberapa nama (ketik 'selesai' untuk berhenti):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("selesai")) {
                break;
            }
            names.add(input);
        }

        System.out.println("Nama-nama yang dimasukkan:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}