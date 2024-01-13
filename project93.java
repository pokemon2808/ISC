import java.util.Vector;
import java.util.Iterator;

public class project93 {

    public static void main(String[] args) {
        // Membuat objek Vector
        Vector<String> vector = new Vector<>();

        // Menambahkan elemen ke dalam Vector
        vector.add("Apel");
        vector.add("Pisang");
        vector.add("Jeruk");
        vector.add("Anggur");

        // Menampilkan elemen-elemen Vector
        System.out.println("Elemen-elemen Vector: " + vector);

        // Mengakses elemen berdasarkan indeks
        System.out.println("Elemen pada indeks 2: " + vector.get(2));

        // Mengubah elemen berdasarkan indeks
        vector.set(1, "Mangga");
        System.out.println("Vector setelah mengubah elemen pada indeks 1: " + vector);

        // Menghapus elemen berdasarkan indeks
        vector.remove(3);
        System.out.println("Vector setelah menghapus elemen pada indeks 3: " + vector);

        // Menggunakan iterator untuk traversal
        System.out.println("Elemen-elemen Vector menggunakan Iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Menghitung jumlah elemen dalam Vector
        System.out.println("Ukuran Vector: " + vector.size());

        // Menghapus semua elemen dari Vector
        vector.clear();
        System.out.println("Vector setelah menghapus semua elemen: " + vector);
    }
}
