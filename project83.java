import javax.swing.*;
import java.awt.event.*;

public class project83 {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Contoh GUI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel
        JPanel panel = new JPanel();
        frame.add(panel);

        // Menambahkan tombol
        JButton tombol = new JButton("Klik Saya!");
        panel.add(tombol);

        // Menambahkan label
        JLabel label = new JLabel("Belum diklik");
        panel.add(label);

        // Menambahkan event listener pada tombol
        tombol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol telah diklik!");
            }
        });

        // Menampilkan frame
        frame.setVisible(true);
    }
}
