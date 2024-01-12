// Definisikan kelas Book
class Book {
    // Variabel anggota (fields)
    String title;
    String author;
    int pages;

    // Konstruktor untuk menginisialisasi objek Book
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Metode untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

public class project92 {
    public static void main(String[] args) {
        // Membuat objek Book
        Book book1 = new Book("Java Programming", "John Doe", 300);
        Book book2 = new Book("Data Structures", "Jane Smith", 400);

        // Menampilkan informasi buku
        System.out.println("Book 1:");
        book1.displayInfo();

        System.out.println("\nBook 2:");
        book2.displayInfo();
    }
}
