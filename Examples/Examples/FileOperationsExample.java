package Examples;

import java.io.IOException;
import java.nio.file.*;

public class FileOperationsExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("example.txt");

        // Create a file
        try {
            Files.createFile(filePath);
            System.out.println("File created: " + filePath.toString());
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

        // Write to a file
        String content = "Hello, World!";
        try {
            Files.write(filePath, content.getBytes(), StandardOpenOption.WRITE);
            System.out.println("Content written to file: " + content);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Delete a file
        try {
            Files.delete(filePath);
            System.out.println("File deleted: " + filePath.toString());
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }
}