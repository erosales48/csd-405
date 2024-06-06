package Examples;

public class SimpleStringBufferExample {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();

        // Define the first thread
        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    sb.append("Thread1 ");
                }
            }
        };

        // Define the second thread
        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    sb.append("Thread2 ");
                }
            }
        };

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final content of the StringBuffer
        System.out.println(sb.toString());
    }
}