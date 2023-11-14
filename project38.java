// Kelas Induk (Parent Class)
class Kendaraan {
    protected String merek;
    protected String warna;
    
    public Kendaraan(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }
    
    public void infoKendaraan() {
        System.out.println("Kendaraan " + merek + " berwarna " + warna);
    }
}

// Kelas Anak (Child Class)
class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, String warna, int jumlahPintu) {
        super(merek, warna);
        this.jumlahPintu = jumlahPintu;
    }

    public void infoMobil() {
        System.out.println("Mobil " + merek + " berwarna " + warna + " memiliki " + jumlahPintu + " pintu.");
    }
}

public class project38 {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobil = new Mobil("Toyota", "Hitam", 4);
        
        // Memanggil method infoKendaraan() dari kelas Kendaraan
        mobil.infoKendaraan();
        
        // Memanggil method infoMobil() dari kelas Mobil
        mobil.infoMobil();
    }
}


