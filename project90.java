import java.util.Scanner;

public class project90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int number = input.nextInt();

        String result = (number % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + number + " adalah bilangan " + result + ".");
    }
}
