import java.util.*;

// Class untuk menyimpan pesanan makanan setiap orang
class Order {
    private String personName;
    private int foodQuantity;

    public Order(String personName, int foodQuantity) {
        this.personName = personName;
        this.foodQuantity = foodQuantity;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }
}

public class project87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> orders = new HashMap<>();

        System.out.print("Masukkan jumlah orang: ");
        int numPeople = scanner.nextInt();

        for (int i = 0; i < numPeople; i++) {
            System.out.print("Masukkan nama orang ke-" + (i + 1) + ": ");
            String personName = scanner.next();
            System.out.print("Masukkan jumlah pesanan makanan untuk " + personName + ": ");
            int foodQuantity = scanner.nextInt();

            if (orders.containsKey(personName)) {
                int currentQuantity = orders.get(personName);
                orders.put(personName, currentQuantity + foodQuantity);
            } else {
                orders.put(personName, foodQuantity);
            }
        }

        System.out.println("\nJumlah pesanan makanan setiap orang:");
        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int totalOrders = orders.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nTotal pesanan makanan dari semua orang: " + totalOrders);

        scanner.close();
    }
}
