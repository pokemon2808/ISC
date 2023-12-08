
class Vehicle {
    private String brand;
    private int year;

    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public String getVehicleInfo() {
        return "Brand: " + brand + ", Year: " + year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    
    public String getCarInfo() {
        return getVehicleInfo() + ", Number of Doors: " + numberOfDoors;
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSideCar;
    
    public Motorcycle(String brand, int year, boolean hasSideCar) {
        super(brand, year);
        this.hasSideCar = hasSideCar;
    }

    
    public String getMotorcycleInfo() {
        return getVehicleInfo() + ", Has Side Car: " + hasSideCar;
    }
}


public class project60 {
    public static void main(String[] args) {
        // Membuat objek mobil
        Car myCar = new Car("Toyota", 2020, 4);

        // Membuat objek sepeda motor
        Motorcycle myMotorcycle = new Motorcycle("Harley Davidson", 2022, false);

        // Menampilkan informasi kendaraan
        System.out.println("Car Information: " + myCar.getCarInfo());
        System.out.println("Motorcycle Information: " + myMotorcycle.getMotorcycleInfo());
    }
}
