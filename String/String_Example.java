public class String_Example{
    public static void main(String[] args) {
        
        // String name1 = "Jayesh";
        // String name2 = "Jayesh";
        // System.out.println(name1 == name2);

        String name1 = new String("Jayesh");
        String name2 = new String("Jayesh");
        // System.out.println(name1 == name2);      // compare the memory location
        System.out.println(name1.equals(name2)); // compare the value
    }
}