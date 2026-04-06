
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        // creating arraylist
        ArrayList<String> names = new ArrayList<>();

        //Adding elements
        names.add("Jayesh");
        names.add("Lekhit");
        names.add("Yogeshwar");
        names.add("Lekhit");

        // Access elements
        System.out.println(names.get(2));

        // Remove element
        names.remove("Lekhit");
        System.out.println(names);

        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);

        System.out.println(num);

        num.remove(Integer.valueOf(2));
        System.out.println(num);
    }
}