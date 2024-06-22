/* Edgar Rosales
 * 22 June 2024
 * CSD405-J318 Intermediate Java Programming
 * Module 5 Programming assignment Program 2
 * Write a program to create a new file titled data.file, if the file does not exist.
 * Then write to the new file, adding 10 randomly generated numbers, or append 10 randomly generated numbers to a previous file.
 * Each integer is to be separated by a space.
 * Close the file, then reopen the file and read the data from the file and display it.
 */

package module5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        try {
            // Check if the file exists and create a new one if it does not
            if (!file.exists()) {
                file.createNewFile();
            }

            // Write to the file, either adding or appending 10 randomly generated numbers
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100); // Random number between 0 and 99
                pw.print(number + " ");
            }
            pw.close();

            // Reopen the file to read the data
            Scanner fileScanner = new Scanner(file);
            List<Integer> numbers = new ArrayList<>();

            while (fileScanner.hasNextInt()) {
                numbers.add(fileScanner.nextInt());
            }

            fileScanner.close();

            // Display the data read from the file
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
