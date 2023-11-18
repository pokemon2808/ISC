import java.util.Scanner;
import java.util.ArrayList;
public class pengujian5 {
    public static void main(String[] args) {
        int awal, akhir, jumlahgenap, jumlahganjil;
        Scanner input = new Scanner((System.in));
        
        ArrayList<Integer>genap =new ArrayList<Integer>();
        ArrayList<Integer>ganjil =new ArrayList<Integer>();
        
        System.out.println("masukkan nilai awal :");
        awal = input.nextInt();
        System.out.println("masukkan nilai akhir :");
        akhir = input.nextInt();

        for( int x= awal; x< akhir+1; x++){
            if (x %2 ==0) {
                genap.add(x);
            }else{
                ganjil.add(x);
            }
        }
        //System.out.println(genap);
        //System.out.println(ganjil);

        jumlahgenap =genap.get(0);
        jumlahganjil =ganjil.get(0);

        for (int x =1; x<ganjil.size(); x++){
            jumlahganjil +=ganjil.get(x);
    }
        for (int x =1; x<genap.size(); x++){
            jumlahgenap +=genap.get(x);
    }
    System.out.println("jumlah genap adalah ;"+jumlahgenap);
    System.out.println("jumlah ganjil adalah ;"+jumlahganjil);
}
}
