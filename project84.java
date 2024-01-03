import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class project84 extends JFrame {
    private JLabel label;

    public project84() {
        setTitle("Tampilkan Gambar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        label = new JLabel();

        try {
            // Mengambil gambar dari file (ganti dengan path gambar yang Anda miliki)
            BufferedImage image = ImageIO.read(new File("mobilelegends.png")); // Ganti dengan path gambar Anda

            // Menampilkan gambar pada label
            ImageIcon icon = new ImageIcon(image);
            label.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mengatur tata letak
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Memastikan GUI dijalankan pada EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(() -> {
            project84 gui = new project84();
            gui.setVisible(true);
        });
    }
}
