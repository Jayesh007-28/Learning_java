// Program to understand comparison of Integer wrapper objects

public class WrapperExample2 {

    public static void main(String[] args) {
        
        // Autoboxing: primitive int value automatically converted to Integer object
        Integer a = 100;
        Integer b = 100;

        // '==' checks reference (memory address) for objects
        // For values between -128 to 127, Java uses Integer caching
        // So both a and b refer to the same object in memory
        System.out.println(a == b);   // true

        // equals() checks actual value stored in the object
        System.out.println(a.equals(b));  // true


        // Creating Integer objects with value 200
        Integer c = 200;
        Integer d = 200;

        // '==' compares memory reference
        // Values outside -128 to 127 are NOT cached
        // So c and d are stored in different objects
        System.out.println(c == d);   // false

        // equals() compares the actual values inside objects
        System.out.println(c.equals(d));  // true
    }
}