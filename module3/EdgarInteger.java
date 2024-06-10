/* Edgar Rosales
 * 9 June 2024
 * CSD405-J318 Intermediate Java Programming
 * 
 * Module 3 Assignment
 * Create a class called EdgarInteger.
 * this class is to contain:
 * 1. A private int variable called edgar
 * 2. A constructor that takes and sets the initial value.
 * 3. Getters and setters methods.
 * 4. Non-static methods titled isEven(), isOdd(), and isPrime() returning true or false based on the variable's value.
 * 5. Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with the same basic logic as the previous methods 
 *    with results based on the parameter.
 * 6. Static methods with signatures isEven(Integer), isOdd(Integer), and isPrime(integer) with the same basic logic as the previous
 *    methods with results based on the parameter.
 * 7. The methods equals(int) and equals(Integer) which return true if int values are equal and false if they are not.
 * 8. Write test code that creates three instances, two with the same value and one with a different value.
 * 9. Write test code that ensures all methods function correctly.
 */

public class EdgarInteger {
    private int edgar;

    // Constructors
    public EdgarInteger(int edgar) {
        this.edgar = edgar;
    }

    public EdgarInteger() {
        this.edgar = 53;
    }

    // Getter
    public int getEdgar() {
        return edgar;
    }

    // Setter
    public void setEdgar(int edgar) {
        this.edgar = edgar;
    }

    // Non-static methods
    public boolean isEven() {
        return edgar % 2 == 0;
    }

    public boolean isOdd() {
        return edgar % 2 != 0;
    }

    public boolean isPrime() {
        if (edgar <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(edgar); i++) {
            if (edgar % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static methods int
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static methods Integer
    public static boolean isEven(EdgarInteger obj) {
        return obj.getEdgar() % 2 == 0;
    }

    public static boolean isOdd(EdgarInteger obj) {
        return obj.getEdgar() % 2 != 0;
    }

    public static boolean isPrime(EdgarInteger obj) {
        return isPrime(obj.getEdgar());
    }

    // Equals methods
    public boolean equals(int value) {
        return this.edgar == value;
    }

    public boolean equals(EdgarInteger obj) {
        return this.edgar == obj.getEdgar();
    }

    // Main - Test code
    public static void main(String[] args) {
        EdgarInteger int1 = new EdgarInteger();
        EdgarInteger int2 = new EdgarInteger(53);
        EdgarInteger int3 = new EdgarInteger(22);

        // display values
        System.out.println("----------------------------------------------------------------");
        System.out.println("Values of int1, int2, and int3");
        System.out.println("----------------------------------------------------------------");
        System.out.println("int1: " + int1.getEdgar());
        System.out.println("int2: " + int2.getEdgar());
        System.out.println("int3: " + int3.getEdgar());
        System.out.println("----------------------------------------------------------------");

        // Test non-static methods
        System.out.println("----------------------------------------------------------------");
        System.out.println("Test Non-Static Methods");
        System.out.println("----------------------------------------------------------------");
        System.out.println("int1 is even: " + int1.isEven()); // false
        System.out.println("int1 is odd: " + int1.isOdd()); // true
        System.out.println("int1 is prime: " + int1.isPrime()); // true
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------");
        System.out.println("int3 is even: " + int3.isEven()); // true
        System.out.println("int3 is odd: " + int3.isOdd()); // false
        System.out.println("int3 is prime: " + int3.isPrime()); // false
        System.out.println("----------------------------------------------------------------");

        // Test static methods with int
        System.out.println("----------------------------------------------------------------");
        System.out.println("Test Static Methods With int");
        System.out.println("----------------------------------------------------------------");
        System.out.println("53 is even: " + EdgarInteger.isEven(53)); // false
        System.out.println("53 is odd: " + EdgarInteger.isOdd(53)); // true
        System.out.println("53 is prime: " + EdgarInteger.isPrime(53)); // true

        System.out.println("22 is even: " + EdgarInteger.isEven(22)); // true
        System.out.println("22 is odd: " + EdgarInteger.isOdd(22)); // false
        System.out.println("22 is prime: " + EdgarInteger.isPrime(22)); // false
        System.out.println("----------------------------------------------------------------");

        // Test static methods with EdgarInteger
        System.out.println("----------------------------------------------------------------");
        System.out.println("Test static methods with EdgarInteger");
        System.out.println("----------------------------------------------------------------");
        System.out.println("int1 is even (static): " + EdgarInteger.isEven(int1)); // false
        System.out.println("int1 is odd (static): " + EdgarInteger.isOdd(int1)); // true
        System.out.println("int1 is prime (static): " + EdgarInteger.isPrime(int1)); // true

        System.out.println("int3 is even (static): " + EdgarInteger.isEven(int3)); // true
        System.out.println("int3 is odd (static): " + EdgarInteger.isOdd(int3)); // false
        System.out.println("int3 is prime (static): " + EdgarInteger.isPrime(int3)); // false
        System.out.println("----------------------------------------------------------------");

        // Test equals methods
        System.out.println("----------------------------------------------------------------");
        System.out.println("Test equals methods");
        System.out.println("----------------------------------------------------------------");
        System.out.println("int1 equals int2: " + int1.equals(int2)); // true
        System.out.println("int1 equals 53: " + int1.equals(53)); // true
        System.out.println("int1 equals int3: " + int1.equals(int3)); // false
        System.out.println("int1 equals 22: " + int1.equals(22)); // false
        System.out.println("----------------------------------------------------------------");
    }
}
