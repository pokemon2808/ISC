
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Mahasiswa {
    String nama;
    int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim=" + nim +
                '}';
    }
}

public class project18 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

        // Membuat Queue menggunakan LinkedList
        Queue<Mahasiswa> mahasiswaQueue = new LinkedList<>();

        // Menambahkan data mahasiswa ke dalam ArrayList
        mahasiswaList.add(new Mahasiswa("Muh.Arif", 12345));
        mahasiswaList.add(new Mahasiswa("Muh.Riza", 67890));
        mahasiswaList.add(new Mahasiswa("Reza Arianto", 54321));

        // Menambahkan data mahasiswa ke dalam Queue
        mahasiswaQueue.offer(new Mahasiswa("Ana Islamaya", 98765));
        mahasiswaQueue.offer(new Mahasiswa("Nur Lela", 24680));

        // Menampilkan data mahasiswa dari ArrayList
        System.out.println("Data Mahasiswa dari ArrayList:");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa);
        }

        // Menampilkan data mahasiswa dari Queue
        System.out.println("\nData Mahasiswa dari Queue:");
        while (!mahasiswaQueue.isEmpty()) {
            Mahasiswa mahasiswa = mahasiswaQueue.poll();
            System.out.println(mahasiswa);
        }
    }
}
