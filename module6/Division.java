/* Edgar Rosales
 * 22 June 2024
 * CSD405-J318 Intermediate Java Programming
 * 
 * Module 6
 * Create an abstract Division class with fields for a company's division name and account number,
 * and an abstract display() method that will be defined in the subclasses.
 * 
 * This is an abstract class with fields for the division name and account number, and an abstract display() method.
 */

package module6;

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display(); //Abstract display Method
}
