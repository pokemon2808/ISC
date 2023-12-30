import javax.swing.*;

public class project80 {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Aplikasi GUI Sederhana");
        frame.setSize(300, 200); // Menentukan ukuran frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Menentukan operasi default saat menutup frame

        // Membuat panel
        JPanel panel = new JPanel();

        // Membuat label
        JLabel label = new JLabel("Ini adalah GUI sederhana.");

        // Menambahkan label ke panel
        panel.add(label);

        // Menambahkan panel ke frame
        frame.add(panel);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
