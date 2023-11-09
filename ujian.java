import java.util.Scanner;

public class ujian {
    public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    System.out.println(" masukkan nukau anda");
    int x =Input.nextInt();
    System.out.println(" Masukkan nilai Y =");
    int y = Input.nextInt();

    int p = x+y;
    int q;

    if (p>=4) {
        q = x*p;

    }else{
        q = x/p;
    }
    System.out.println("total nilai adalah ="+p);

    }
}
