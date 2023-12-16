import java.util.Stack;

class QueueWithStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueWithStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int x) {
        // Pindahkan semua elemen dari stack1 ke stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Tambahkan elemen baru ke stack1
        stack1.push(x);

        // Pindahkan kembali semua elemen dari stack2 ke stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Ambil elemen dari stack1 untuk dequeue
        int x = stack1.pop();
        return x;
    }

    public int peek() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Lihat elemen paling depan tanpa menghapusnya
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}

public class project67 {
    public static void main(String[] args) {
        QueueWithStack queue = new QueueWithStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("element depan : " + queue.peek());
        System.out.println("apakah antrian kosong : " + queue.isEmpty());
    }
}
