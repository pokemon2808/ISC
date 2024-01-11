import java.util.Scanner;

public class project92 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.print("Pilih operasi matematika (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
                System.exit(1);
        }

        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}
