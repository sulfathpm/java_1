import java.io.FileInputStream;
import java.io.IOException;

public class pg2 {
    public static void main(String[] args) {
        // Try-with-resources to automatically close the file input stream
        try (FileInputStream in = new FileInputStream("input.bin")) {
            
            int data;
            // read() returns the byte as an int, or -1 if the end of file is reached
            while ((data = in.read()) != -1) {
                // Casting the int back to a byte/char to print the actual character
                System.out.print((char) data); 
            }
            
        } catch (IOException e) {
            // Handling the checked exception
            e.printStackTrace();
        }
    }
}