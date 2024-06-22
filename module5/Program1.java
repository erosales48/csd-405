/* Edgar Rosales
 * 22 June 2024
 * CSD405-J318 Intermediate Java Programming
 * Module 5 Programming assignment Program 1
 *  Write a program that uses an ArrayList filled with a minimum of 10 Strings.
 * Use a ‘for-each’ loop to print the ArrayList collection.
 * Then ask a user which element they would like to see again.
 * Then, attempt printing the element in a try/catch format which will result in the element being display.
 * If the element value received is invalid, display a message that an Exception has been thrown displaying “Out of Bounds”.
 * In this program, include the use of Auto-boxing/Auto-Unboxing, working with a user String input.
 */
 
 package module5;

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Program1 {
     public static void main(String[] args) {
         // Create an ArrayList filled with a minimum of 10 Strings
         ArrayList<String> battlemechs = new ArrayList<String>();
         battlemechs.add("Atlas");
         battlemechs.add("Timber Wolf");
         battlemechs.add("Hunchback");
         battlemechs.add("Mad Cat");
         battlemechs.add("Marauder");
         battlemechs.add("Warhammer");
         battlemechs.add("Locust");
         battlemechs.add("Shadow Hawk");
         battlemechs.add("Raven");
         battlemechs.add("Battlemaster");
 
         // Use a ‘for-each’ loop to print the ArrayList collection with index
         for (int i = 0; i < battlemechs.size(); i++) {
             System.out.println(i + ": " + battlemechs.get(i));
         }
 
         Scanner scanner = new Scanner(System.in);
         String input = "";
 
         while (true) {
             System.out.print("Enter the index of the element you would like to see again (or 'E' to exit): ");
             input = scanner.nextLine();
 
             if (input.equalsIgnoreCase("E")) {
                 System.out.println("Exiting...");
                 break;
             }
 
             try {
                 Integer index = Integer.parseInt(input); // Auto-boxing: converts int to Integer
                 System.out.println("You selected: " + index + ": " + battlemechs.get(index)); // Auto-unboxing: converts Integer to int
             } catch (IndexOutOfBoundsException e) {
                 System.out.println("Out of Bounds");
             } catch (NumberFormatException e) {
                 System.out.println("Invalid input. Please enter a valid integer.");
             }
         }
 
         scanner.close();
     }
 }
 