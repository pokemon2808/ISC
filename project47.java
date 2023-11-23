import java.util.ArrayList;

public class project47 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

    
        list.add("Elemen 1");
        list.add("Elemen 2");
        list.add("Elemen 3");


        System.out.println("Isi ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }


        list.add("Elemen 4");


        System.out.println("\nIsi ArrayList setelah menambah elemen baru:");
        for (String element : list) {
            System.out.println(element);
        }

        // Menghapus elemen dari ArrayList
        list.remove("Elemen 2");

        System.out.println("\nIsi ArrayList setelah menghapus elemen 'Elemen 2':");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
