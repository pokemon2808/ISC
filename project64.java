import java.util.LinkedList;
import java.util.Queue;

public class project64 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Menambah elemen ke dalam queue
        queue.add("Elemen 1");
        queue.add("Elemen 2");
        queue.add("Elemen 3");

        System.out.println("Isi awal dari queue: " + queue);

        // Menghapus elemen pertama dari queue
        String removedElement = queue.poll();
        System.out.println("Elemen yang dihapus: " + removedElement);
        System.out.println("Isi setelah penghapusan: " + queue);

        // Melihat elemen pertama dari queue tanpa menghapusnya
        String peekedElement = queue.peek();
        System.out.println("Elemen pertama tanpa penghapusan: " + peekedElement);
        System.out.println("Isi akhir dari queue: " + queue);
    }
}
