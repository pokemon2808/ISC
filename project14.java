import java.util.Scanner;
public class project14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan tanggal :");
        int tanggal = input.nextInt();
        System.out.print("masukkan bulan :");
        int bulan = input.nextInt();

        if (tanggal > 31 || bulan > 12){
            System.out.println("tanggal lahir macam apa itu ");
        } else{
            if( tanggal > 22 && bulan == 1 || tanggal < 21 && bulan == 2){
                System.out.println("Aquarius");
                
            }else if ( tanggal > 22 && bulan == 2 || tanggal < 21 && bulan == 3 ){
                System.out.println("Pisces");
            }else if ( tanggal > 22 && bulan == 3 || tanggal < 21 && bulan == 4 ){
                System.out.println("Aries");
            }else if ( tanggal > 22 && bulan == 4 || tanggal < 21 && bulan ==5 ){
                System.out.println("Taurus");
            }else if ( tanggal > 22 && bulan == 5 || tanggal < 21 && bulan == 6 ){
                System.out.println("Gemini");
            }else if ( tanggal > 22 && bulan == 6 || tanggal < 21 && bulan == 7 ){
                System.out.println("Cancer");
            }else if ( tanggal > 22 && bulan == 7 || tanggal < 21 && bulan == 8 ){
                System.out.println("Leo");
            }else if ( tanggal > 22 && bulan == 8 || tanggal < 21 && bulan == 9 ){
                System.out.println("Virgo");
            }else if ( tanggal > 22 && bulan == 9 || tanggal < 21 && bulan == 10 ){
                System.out.println("Libra");
            }else if ( tanggal > 22 && bulan == 10 || tanggal < 21 && bulan == 11 ){
                System.out.println("Scorpio");
            }else if ( tanggal > 22 && bulan == 11 || tanggal < 21 && bulan == 12 ){
                System.out.println("Sagittarius");
            }else if ( tanggal > 22 && bulan == 12 || tanggal < 21 && bulan == 1 ){
                System.out.println("Capricorn");
            }else{
                System.out.println("input tidak dikenali");
            }
        }
    }
}
