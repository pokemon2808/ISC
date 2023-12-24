import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Kelas untuk mewakili produk
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Kelas utama untuk sistem belanja
public class project74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Product> cart = new LinkedList<>();
        double total = 0;

        System.out.println("=== Sistem Belanja ===");

        while (true) {
            System.out.println("\nPilih aksi:");
            System.out.println("1. Tambah produk ke keranjang");
            System.out.println("2. Hapus produk dari keranjang");
            System.out.println("3. Lihat keranjang belanja");
            System.out.println("4. Selesai belanja dan hitung total");
            System.out.println("0. Keluar");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            switch (choice) {
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem belanja.");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Masukkan nama produk: ");
                    String productName = scanner.nextLine();
                    System.out.print("Masukkan harga produk: ");
                    double productPrice = scanner.nextDouble();
                    Product product = new Product(productName, productPrice);
                    cart.offer(product);
                    System.out.println(productName + " ditambahkan ke keranjang.");
                    break;
                case 2:
                    if (!cart.isEmpty()) {
                        Product removedProduct = cart.poll();
                        System.out.println(removedProduct.getName() + " dihapus dari keranjang.");
                    } else {
                        System.out.println("Keranjang belanja kosong.");
                    }
                    break;
                case 3:
                    System.out.println("\nIsi keranjang belanja:");
                    if (!cart.isEmpty()) {
                        for (Product p : cart) {
                            System.out.println(p.getName() + " - Rp" + p.getPrice());
                        }
                    } else {
                        System.out.println("Keranjang belanja kosong.");
                    }
                    break;
                case 4:
                    System.out.println("\nMenghitung total belanja...");
                    total = calculateTotal(cart);
                    System.out.println("Total belanja Anda: Rp" + total);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    // Metode untuk menghitung total belanja
    private static double calculateTotal(Queue<Product> cart) {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }
}
