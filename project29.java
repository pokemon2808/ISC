public class project29 {

    // Fungsi untuk menjumlahkan dua bilangan bulat
    public static int tambah(int a, int b) {
        int hasil = a + b;
        return hasil;
    }

    // Fungsi untuk menghitung luas persegi panjang
    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        int angka1 = 5;
        int angka2 = 3;

        // Memanggil fungsi tambah
        int hasilPenjumlahan = tambah(angka1, angka2);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        double panjang = 4.5;
        double lebar = 3.2;

        // Memanggil fungsi hitungLuasPersegiPanjang
        double luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
    }
}
