import java.util.Scanner;

public class project49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan pilihan (1-3):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Anda memilih pilihan 1");
                break;
            case 2:
                System.out.println("Anda memilih pilihan 2");
                break;
            case 3:
                System.out.println("Anda memilih pilihan 3");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        scanner.close();
    }
}
