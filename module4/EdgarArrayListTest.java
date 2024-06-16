/* Edgar Rosales
 * 15 Jun 2024
 * CSD405-J318 Intermediate Java Programming
 * 
 * Module 4 Assignment
 * Create a class <yourName>ArrayListTest .  Examples:
 *      TomArrayListTest
 *      SueArrayListTest
 *      CindyArrayListTest
 *      Etc.
 * 
 * This class is to contain:
 * 1. A method that receives an ArrayList populated with an Integer data type
 *    holding the integers received from user input.
 * 2. The user input is to accept Integers that are then assigned to the ArrayList
 *    until a value of 0 is entered, which is also assigned to the ArrayList.
 * 3. The ArrayList is then to be sent to the method.
 * 4. The method is then to return the largest value in the ArrayList.
 * 5. If the ArrayList is sent in empty, the method will then return 0.
 * 6. The method signature is to be: public static Integer max (ArrayList list).
 * 7. Write additional code for testing your method.
 * 8. The method will return the largest value that is displayed to the user.
 */

package module4; // Needed for my file structure, why does it force this!

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Class Declaration
public class EdgarArrayListTest {

     // ANSI escape code for red text
     public static final String ANSI_GREEN = "\u001B[32m";
     public static final String ANSI_RESET = "\u001B[0m";

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner object to get user input.
        Scanner scanner = new Scanner(System.in);
        // Create an ArrayList object to hold the user input.
        ArrayList<Integer> list = new ArrayList<>();

        // Prompt the user to enter integers.
        System.out.print("Enter integers (enter 0 to stop): ");
        // Loop until the user enters 0, and watch for mismatch exceptions.
        while (true) {
            try {
                int input = scanner.nextInt();
                list.add(input);
                if (input == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Call the max method to get the largest value in the ArrayList.
        Integer maxValue = max(list);
        // Display the largest value in the ArrayList.
        System.out.println(ANSI_GREEN + "\nThe Max value in the ArrayList is: " + maxValue + ANSI_RESET);
        // Close the Scanner object.
        scanner.close();
    }
    
    // Method to return the largest value in the ArrayList.
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer maxValue = list.get(0);
        for (Integer value : list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
