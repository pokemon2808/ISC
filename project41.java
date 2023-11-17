import java.io.IOException;
public class project41 {
    public static void main(String[] args) {
        try {
            Process process = new ProcessBuilder().command("notepad").start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}

