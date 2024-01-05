// Antarmuka (interface)
interface Vehicle {
    void start();
    void stop();
}

// Kelas abstrak yang mengimplementasikan antarmuka Vehicle
abstract class Car implements Vehicle {
    private final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // Metode abstract yang harus diimplementasikan oleh kelas turunannya
    public abstract void drive();
}

// Kelas turunan dari Car
class Sedan extends Car {
    public Sedan(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Menyalakan sedan " + getBrand());
    }

    @Override
    public void stop() {
        System.out.println("Menghentikan sedan " + getBrand());
    }

    @Override
    public void drive() {
        System.out.println("Mengemudi sedan " + getBrand());
    }
}

public class project86 {
    public static void main(String[] args) {
        Sedan sedanCar = new Sedan("Toyota");
        sedanCar.start();
        sedanCar.drive();
        sedanCar.stop();
    }
}
