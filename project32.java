import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class project32 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
        System.out.println("masukkan sebuah kata atau kalimat:");
        String input = reader.readLine();
        System.out.println(" anda memasukkan:"+input);

        reader.close();

    }catch(IOException e){
        System.err.println("terjadi kesalahan saat membaca input");
    }
    }
}
