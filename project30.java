import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class project30 {
    public static void main(String[] args) {
        String text =" Program studi teknik Informatika, Fakultas Teknik; Universitas Sulawesi barat";
        Pattern p = Pattern.compile("."); 
        Matcher m = p.matcher(text);
        String text01 ="";
        while (m.find()) {
            String c = m.group();
            if (c.equalsIgnoreCase("a")) {
                text01 +="x";
            }else{
                text01 += c;
            }
        }
        System.out.println(text01);
    }
}
