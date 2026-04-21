import java.io.FileOutputStream;
import java.io.IOException;

public class pg1 {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the file is closed automatically
        try (FileOutputStream out = new FileOutputStream("output.bin")) {
            
            // Byte array representing ASCII characters: 65=A, 66=B, 67=C, 68=D
            byte[] data = { 65, 66, 67, 68 };
            
            // Writing the byte array to the source
            out.write(data);
            
            System.out.println("Data successfully written to output.bin");
            
        } catch (IOException e) {
            // Common causes: File not found, Disk errors, Permission denied
            e.printStackTrace();
        }
    }
}