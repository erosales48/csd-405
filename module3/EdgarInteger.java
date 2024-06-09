import java.math.*;

public class EdgarInteger {
    private int edgar;

    // Constructor
    public EdgarInteger(int edgar) {
        this.edgar = edgar;
    }

    public EdgarInteger() {
        this.edgar = 51;
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
        for (int i = 2; i <= Math.sqrt(edgar); i++) {
            if (edgar % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static methods
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
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

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

    // Test code
    public static void main(String[] args) {
        EdgarInteger int1 = new EdgarInteger();
        EdgarInteger int2 = new EdgarInteger(51);
        EdgarInteger int3 = new EdgarInteger(22);

        System.out.println("int1: " + int1.getEdgar());
        System.out.println("int2: " + int2.getEdgar());
        System.out.println("int3: " + int3.getEdgar());

        // Test non-static methods
        System.out.println("int1 is even: " + int1.isEven()); // false
        System.out.println("int1 is odd: " + int1.isOdd()); // true
        System.out.println("int1 is prime: " + int1.isPrime()); // true

        System.out.println("int3 is even: " + int3.isEven()); // true
        System.out.println("int3 is odd: " + int3.isOdd()); // false
        System.out.println("int3 is prime: " + int3.isPrime()); // false

        // Test static methods with int
        System.out.println("51 is even: " + EdgarInteger.isEven(51)); // false
        System.out.println("51 is odd: " + EdgarInteger.isOdd(51)); // true
        System.out.println("51 is prime: " + EdgarInteger.isPrime(51)); // true

        System.out.println("22 is even: " + EdgarInteger.isEven(22)); // true
        System.out.println("22 is odd: " + EdgarInteger.isOdd(22)); // false
        System.out.println("22 is prime: " + EdgarInteger.isPrime(22)); // false

        // Test static methods with EdgarInteger
        System.out.println("int1 is even (static): " + EdgarInteger.isEven(int1)); // false
        System.out.println("int1 is odd (static): " + EdgarInteger.isOdd(int1)); // true
        System.out.println("int1 is prime (static): " + EdgarInteger.isPrime(int1)); // true

        System.out.println("int3 is even (static): " + EdgarInteger.isEven(int3)); // true
        System.out.println("int3 is odd (static): " + EdgarInteger.isOdd(int3)); // false
        System.out.println("int3 is prime (static): " + EdgarInteger.isPrime(int3)); // false

        // Test equals methods
        System.out.println("int1 equals int2: " + int1.equals(int2)); // true
        System.out.println("int1 equals 51: " + int1.equals(51)); // true
        System.out.println("int1 equals int3: " + int1.equals(int3)); // false
        System.out.println("int1 equals 22: " + int1.equals(22)); // false
    }
}
