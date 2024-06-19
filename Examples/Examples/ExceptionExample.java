package Examples;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void methodThatThrowsException() throws IOException {
        // Simulating an exception
        throw new IOException("This is a simulated IOException");
    }
}
