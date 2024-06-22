/* Edgar Rosales
 * 22 June 2024
 * CSD405-J318 Intermediate Java Programming
 * 
 * Module 6
 * Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
 * 
 * This application creates two instances of each subclass and calls their `display()` methods to print their details.
 */

package module6;

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intDiv1 = new InternationalDivision("International Sales", 10110, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("International Support", 11100, "Japan", "Japanese");

        DomesticDivision domDiv1 = new DomesticDivision("Domestic Sales", 420, "California");
        DomesticDivision domDiv2 = new DomesticDivision("Domestic Support", 411, "North Carolina");

        System.out.println("Displaying International Divisions:");
        intDiv1.display();
        intDiv2.display();

        System.out.println("\nDisplaying Domestic Divisions:");
        domDiv1.display();
        domDiv2.display();
    }
}
