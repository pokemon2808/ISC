

public class project46 {
    public static void main(String[] args) {
        int baris = 1;
        int kolom;

        do{
            kolom= 1;
            do{
                System.out.print("*");
                kolom++;
            }while( kolom <= baris);
            System.out.println();
            baris++;
        }while(baris <= 10);
    }
}
