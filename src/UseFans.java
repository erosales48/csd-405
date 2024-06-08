/* Edgar Rosales
   08 Jun 2024
   CSD405-J318 Intermediate Java Programming

   Module 2 Assignment
   Starting with your code from Module 1 create teh following new class titled UseFans:
   1. Create a collection of Fan instances.
   2. Create a method taking a collection of Fan instances for displaying without using the toString() method.
   3. Create a method that takes a single instance of a Fan for displaying without using the toString() method.
   4. Use the this reference throughout the Fan class where allowed.
   5. Write test code that creates a collection of Fans and displays the functionality of all of the
      Fan instances in the collection.
 */

import java.util.*;

public class UseFans {
    // Method to display a collection of Fan instances without using the toString() method.
    public static void displayFans(Collection<Fan> fans) {
        for (Fan fan : fans) {
            fan.display();
        }
    }

    // Method to display a single instance of a Fan without using the toString() method.
    public static void displayFan(Fan fan) {
        fan.display();
    }

    public static void main(String[] args) {
        // Creating a collection of Fan instances.
        Collection<Fan> fans = new ArrayList<>();
        fans.add(new Fan());
        fans.add(new Fan(true, Fan.MEDIUM, 12, "blue"));
        fans.add(new Fan(false, Fan.STOPPED, 8, "red"));

        // Displaying the collection of Fan instances.
        System.out.println("Displaying collection of fans:");
        displayFans(fans);

        // Displaying a single Fan instance.
        System.out.println("\nDisplaying a single fan:");
        Fan singleFan = new Fan(true, Fan.FAST, 10, "green");
        displayFan(singleFan);

        // Test the functionalities of the Fan instances.
        System.out.println("\nTesting functionalities:");
        Fan testFan = new Fan();
        testFan.display();
        testFan.toggleFan();
        testFan.display();
        testFan.increaseSpeed();
        testFan.display();
        testFan.setRadius(10);
        testFan.setColor("purple");
        testFan.display();
    }
}

