import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class project89 {
    public static void main(String[] args) {
        // Create a BufferedReader to read input from the console
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter some text:");

            // Read a line of text from the console
            String userInput = reader.readLine();

            // Display the input
            System.out.println("You entered: " + userInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
