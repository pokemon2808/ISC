import java.util.HashSet;

public class project26 {
public static void main(String[] args) {
    HashSet bendaunik = new HashSet();
    bendaunik.add(1);
    bendaunik.add("mahasiswa");
    bendaunik.add("kamu");
    bendaunik.add(123456);
    bendaunik.add('@');
    bendaunik.add("kamu");
    bendaunik.add("#");
    bendaunik.add(bendaunik);

    HashSet<String>cars =new HashSet <String> ();
    cars.add("volvo");
    cars.add("BMW");
    cars.add("Toyota");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    cars.add("Toyota");
    System.out.println(cars);
    System.out.println("cars.countains(\"Mazda\"):" +cars.contains("mazda"));
    cars.remove("Volvo");
    System.out.println("Setelah menghapus Volvo:"+cars);
    cars.clear();
    System.out.println("setelah clear"+cars);
}
}
