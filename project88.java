import java.util.ArrayList;
import java.util.Scanner;

class Obat {
    private String nama;
    private double harga;
    private int jumlah;

    public Obat(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
}

public class project88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Obat> daftarObat = new ArrayList<>();

        // Memasukkan data obat ke dalam array list
        daftarObat.add(new Obat("Paracetamol", 5000, 100));
        daftarObat.add(new Obat("Amoxicillin", 8000, 80));
        daftarObat.add(new Obat("Omeprazole", 10000, 120));

        // Menampilkan daftar obat yang tersedia
        System.out.println("Daftar Obat yang Tersedia:");
        System.out.println("----------------------------");
        for (Obat obat : daftarObat) {
            System.out.println(obat.getNama() + "\tHarga: " + obat.getHarga() + "\tJumlah Tersedia: " + obat.getJumlah());
        }
        System.out.println("----------------------------");

        // Memulai transaksi
        System.out.println("\nSilakan masukkan pesanan Anda (Nama Obat Jumlah):");
        String input = scanner.nextLine();
        String[] pesanan = input.split(" ");

        String namaObat = pesanan[0];
        int jumlahBeli = Integer.parseInt(pesanan[1]);
        Obat obatDibeli = null;

        // Mencari obat yang dipilih oleh pengguna
        for (Obat obat : daftarObat) {
            if (obat.getNama().equalsIgnoreCase(namaObat)) {
                obatDibeli = obat;
                break;
            }
        }

        // Proses transaksi
        if (obatDibeli != null && obatDibeli.getJumlah() >= jumlahBeli) {
            double totalHarga = obatDibeli.getHarga() * jumlahBeli;
            System.out.println("\nTerima kasih telah melakukan pembelian:");
            System.out.println("Obat: " + obatDibeli.getNama());
            System.out.println("Jumlah: " + jumlahBeli);
            System.out.println("Total Harga: " + totalHarga);
            obatDibeli = new Obat(obatDibeli.getNama(), obatDibeli.getHarga(), obatDibeli.getJumlah() - jumlahBeli);
        } else {
            System.out.println("\nMaaf, obat tidak tersedia atau stok tidak mencukupi.");
        }

        scanner.close();
    }
}
