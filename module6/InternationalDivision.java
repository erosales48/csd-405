/* Edgar Rosales
 * 22 June 2024
 * CSD405-J318 Intermediate Java Programming
 * 
 * Module 6
 * Create two subclasses named InternationalDivision and DomesticDivision.
 * The InternationalDivision class includes a field for the country in which the division is located,
 * a field for the language spoken, and a constructor that requires all fields when created.
 * 
 * This subclass includes additional fields for the country and language, and overrides the `display()` method to show all details.
 */

package module6;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}
