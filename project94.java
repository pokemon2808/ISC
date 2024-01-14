import java.util.Scanner;

public class project94{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " adalah palindrome.");
        } else {
            System.out.println(input + " bukan palindrome.");
        }
    }

    // Fungsi untuk mengecek apakah sebuah string adalah palindrome
    private static boolean isPalindrome(String str) {
        // Menghapus spasi dan mengubah semua huruf ke huruf kecil
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();
        
        // Mengecek palindrome
        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
