package Examples;

public class PrimitiveWrapperExample {
    public static void main(String[] args) {
        // Using Integer (wrapper for int)
        Integer intObj = Integer.valueOf(10);
        int intValue = intObj.intValue();
        System.out.println("Integer value: " + intValue);  // Output: Integer value: 10

        // Using Double (wrapper for double)
        Double doubleObj = Double.valueOf(10.5);
        double doubleValue = doubleObj.doubleValue();
        System.out.println("Double value: " + doubleValue);  // Output: Double value: 10.5

        // Using auto-boxing and auto-unboxing
        Integer autoBoxedInt = 20;
        int autoUnboxedInt = autoBoxedInt;
        System.out.println("Auto-boxed and auto-unboxed Integer value: " + autoUnboxedInt); 
        // Output: Auto-boxed and auto-unboxed Integer value: 20

        Double autoBoxedDouble = 20.5;
        double autoUnboxedDouble = autoBoxedDouble;
        System.out.println("Auto-boxed and auto-unboxed Double value: " + autoUnboxedDouble);  
        // Output: Auto-boxed and auto-unboxed Double value: 20.5
    }
}

