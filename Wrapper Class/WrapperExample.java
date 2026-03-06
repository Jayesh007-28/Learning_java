// Program to understand Wrapper Classes in Java

public class WrapperExample {

    public static void main(String[] args) {

        // Primitive data type
        int primitive = 10;

        // Converting primitive int to Integer object
        // This process is called "Boxing"
        Integer wrapper = Integer.valueOf(primitive);

        // Printing primitive value
        System.out.println(primitive);

        // Printing wrapper object value
        System.out.println(wrapper);

        // String containing a numeric value
        String num = "100";

        // Converting String to primitive int
        // parseInt() method of Integer class is used
        int value = Integer.parseInt(num);

        // Printing converted integer value
        System.out.println(value);
    }
}