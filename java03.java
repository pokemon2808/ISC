import java.util.Scanner;
public class java03 {
    public static void main(String[] args) {
        int size = 4;
        String[] Nim = new String[size];
        String[] Nama = new String[size];
        double[] Nilai = new double[size];
        char[] Nilai_Huruf = new char[size];

        System.out.println("=======================================================================");
        System.out.println("INPUT MAHASISWA");
        for(int i= 0; i < size; i++){
            System.out.println(" baris_"+(i+1)+"======================");;;
            Scanner input  = new Scanner(System.in);
            System.out.print("NIM :");
            String nim = input.nextLine();
            Nim[i]= nim;

            System.out.print("NAMA MAHASISWA :");
            String nama = input.nextLine();
            Nama[i] = nama;

            System.out.print("Nilai  Angka :");
            double nilai = input.nextDouble();
            Nilai[i] = nilai;
            
            char  NilaiHuruf ='E';
            if ( nilai >=80){
                NilaiHuruf ='A';
            }else if (nilai >=60){
                NilaiHuruf ='B';
            }else if (nilai >=40){
                NilaiHuruf ='C';
            }else{
                NilaiHuruf ='E';
            }
            Nilai_Huruf[i] = NilaiHuruf;

            System.out.println();
        }
        System.out.println(" ========================");
        System.out.println("Nilai yang keluar");
        System.out.println("NO.\tNIM\tNAMA\tNilai Angka\tNilai Huruf\t");
        double jumlah = 0;
        for (int i= 0; i < size; i++){
            String nim = Nim[i];
            System.out.println(nim+"\t");
            
            String nama =Nama[i];
            System.out.println(nama+"\t");

            double nilai = Nilai[i];
            System.out.println(nilai+"\t");

            char nilaihuruf = Nilai_Huruf[i];
            System.out.println(nilaihuruf+"\t");

            System.out.println();
        }
        System.out.println("=============================");
        double average = jumlah/ size;
        System.out.println("average"+average);
    }
}
