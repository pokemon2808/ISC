import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class project50 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan angka kedua: ");
            double angka2 = Double.parseDouble(reader.readLine());
            
            System.out.println("Pilih operasi aritmatika:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Pilihan Anda (1-4): ");

            int pilihan = Integer.parseInt(reader.readLine());
            
            double hasil = 0;
            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Pembagian dengan nol tidak diizinkan.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Program berhenti.");
                    return;
            }
            	
            System.out.println("Hasil: " + hasil);
            
            reader.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
