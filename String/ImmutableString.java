public class ImmutableString {
    public static void main(String[] args) {
        
        String str = "Jayesh";

        // str.concat(" Java");

        // System.out.println(str);  // print only Jayesh

        str = str.concat(" Java Developer");
        System.out.println(str);     //prints Jayesh Java Developer
    }
}
