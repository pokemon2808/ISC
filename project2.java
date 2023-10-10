import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class project3 {
public static void main(String[] args) {
    Queue<String> antrian = new LinkedList<>();
            Scanner input = new Scanner(System.in);
    
            int nomorAntrian = 1;
    
            while (true) {
                System.out.println("Silakan pilih opsi:");
                System.out.println("1. Tambahkan pasien ke antrian");
                System.out.println("2. Keluarkan pasien dari antrian");
                System.out.println("3. Tampilkan jumlah pasien dalam antrian");
                System.out.println("4. Keluar dari program");
    
                int masukkan = input.nextInt();
    
             switch (masukkan) {
                 case 1:
                     System.out.print("Masukkan nama pasien: ");
                     String namaPasien
                             = input.next();
                     antrian.add(nomorAntrian + ". " + namaPasien);
                     System.out.println("Pasien " + namaPasien + " telah ditambahkan ke dalam antrian dengan nomor antrian " + nomorAntrian);
                     nomorAntrian++;
                     break;
                 case 2:
                     if (antrian.isEmpty()) {
                         System.out.println("Antrian kosong");
                     } else {
                         String pasien = antrian.poll();
                         System.out.println("Pasien " + pasien + " telah dikeluarkan dari antrian");
                     }break;
                 case 3:
                     System.out.println("Jumlah pasien dalam antrian: " + antrian.size());
                     break;
                 case 4:
                     System.out.println("Terima kasih sudah menggunakan program ini");
                     break;
                 default:
                     break;
             }
                    
            }
        }
}
