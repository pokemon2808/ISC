public class project62 {
    public static void main(String[] args) {
        try {
            int pembilang = 10;
            int penyebut = 0;
            
            // Mencoba melakukan pembagian
            int hasil = bagi(pembilang, penyebut);
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            // Menangani ArithmeticException yang terjadi (pembagian oleh nol)
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        }
    }

    public static int bagi(int pembilang, int penyebut) {
        if (penyebut == 0) {
            // Membuang exception jika penyebut adalah nol
            throw new ArithmeticException("Tidak dapat melakukan pembagian oleh nol!");
        }
        return pembilang / penyebut;
    }
}
