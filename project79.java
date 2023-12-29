import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class project79 {
    public static void main(String[] args) {
        // Membuat objek stack
        Stack<Integer> stack = new Stack<>();
        
        // Memasukkan elemen ke dalam stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Membuat objek queue menggunakan LinkedList
        Queue<Integer> queue = new LinkedList<>();
        
        // Menambahkan elemen dari stack ke queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        
        // Menampilkan elemen dari queue
        System.out.println("Elemen dalam Queue setelah memindahkan dari Stack:");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
 
    

