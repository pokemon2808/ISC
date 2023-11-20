import java.util.Scanner;

public class project44 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print(" masukkan jumlah baris : ");
    int baris = input.nextInt();

    System.out.print("masukkan jumlah kolom : ");
    int kolom = input.nextInt();

    int[][] array2D = new int[baris][kolom];

    System.out.print(" masukkan elemen array : ");
    for ( int i =0; i < baris; i++ ){
        for (int j = 0; j < kolom; j++) {
            System.out.print(" elemen baris "+(i+ 1)+"kolom "+(j+1)+": ");
            array2D[i][j] = input.nextInt();
        }
    }
    System.out.println(" array 2D yang diinputkan");
    for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
    System.out.println(array2D[i][j]);            
        }
    System.out.println();
    }
    }
}
