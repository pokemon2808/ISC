import javax.swing.*;
import java.awt.*;

public class project85 extends JFrame {
    public project85() {
        setTitle("Gambar dan Teks");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Gambar
        ImageIcon imageIcon = new ImageIcon("mobilelegends.png"); // Ganti "gambar.jpg" dengan nama dan path gambar Anda
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel, BorderLayout.CENTER);

        // Teks
        JLabel textLabel = new JLabel("Ini adalah contoh teks");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(textLabel, BorderLayout.SOUTH);

        // Menampilkan panel utama
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new project85();
        });
    }
}
