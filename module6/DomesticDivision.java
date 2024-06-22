/* Edgar Rosales
 * 22 June 2024
 * CSD405-J318 Intermediate Java Programming
 * 
 * Module 6
 * Create two subclasses named InternationalDivision and DomesticDivision.
 * The DomesticDivision class includes a field for the state in which the division is located 
 * and a constructor that requires all fields when created.
 * 
 * This subclass includes an additional field for the state, and overrides the `display()` method to show all details.
 */

package module6;

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
    }
}
