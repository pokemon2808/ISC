import java.util.*;

public class project75 {
    public static void main(String[] args) {
        // Membuat objek Stack menggunakan kelas Stack bawaan Java
        Stack<Integer> stack = new Stack<>();

        // Menambahkan nilai ke dalam stack menggunakan metode push()
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println("Isi stack saat ini: " + stack);

        // Menghapus nilai dari stack menggunakan metode pop()
        int removedValue = stack.pop();
        System.out.println("Nilai yang dihapus dari stack: " + removedValue);

        System.out.println("Isi stack setelah penghapusan: " + stack);
    }
}
