import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class project34 {
    public static void main(String[] args) {
        // Membuat objek BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Membaca input dari pengguna
            System.out.print("Masukkan sebuah teks: ");
            String userInput = reader.readLine();

            // Menampilkan input dari pengguna
            System.out.println("Anda memasukkan: " + userInput);
        } catch (IOException e) {
            System.err.println("Error membaca input: " + e.getMessage());
        } finally {
            try {
                // Menutup BufferedReader setelah selesai digunakan
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error menutup BufferedReader: " + e.getMessage());
            }
        }
    }
}

