import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class project82 {

    public static void main(String[] args) {
        // Membuat jendela utama
        JFrame frame = new JFrame("Contoh Program GUI");
        frame.setSize(300, 200); // Mengatur ukuran jendela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Mengatur operasi default pada penutupan jendela

        // Membuat tombol
        JButton tombol = new JButton("Klik Saya!");
        
        // Menambahkan aksi pada tombol
        tombol.addActionListener(e -> {
            // Menampilkan pesan dialog saat tombol ditekan
            JOptionPane.showMessageDialog(frame, "Tombol telah ditekan!");
        });

        // Menambahkan tombol ke dalam jendela
        frame.getContentPane().add(tombol);

        // Menampilkan jendela
        frame.setVisible(true);
    }
}
