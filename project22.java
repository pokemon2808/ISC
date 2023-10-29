class Hewan {
    String jenis;

    public Hewan(String jenis) {
        this.jenis = jenis;
    }

    public void suara() {
        System.out.println("Suara hewan...");
    }
}

// Sub class atau child class
class Kucing extends Hewan {
    String warna;

    public Kucing(String jenis, String warna) {
        super(jenis); // Memanggil konstruktor dari super class
        this.warna = warna;
    }

    // Override metode suara dari super class
    @Override
    public void suara() {
        System.out.println("Meong!");
    }

    public void tidur() {
        System.out.println("Kucing tidur...");
    }
}

public class project22 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kucing", "Putih");
        System.out.println("Jenis: " + kucing.jenis);
        System.out.println("Warna: " + kucing.warna);
        kucing.suara(); // Memanggil metode suara dari sub class
        kucing.tidur(); // Memanggil metode tidur dari sub class
    }
}