import java.util.ArrayList;
import java.util.List;

public class project63 {
    public static void main(String[] args) {
        // Membuat dua ArrayList
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Menambahkan elemen ke list1
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Menambahkan elemen ke list2
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Menggabungkan kedua ArrayList
        List<Integer> hasilGabungan = new ArrayList<>(list1);
        hasilGabungan.addAll(list2);

        // Menampilkan hasil
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Hasil Gabungan: " + hasilGabungan);
    }
}
