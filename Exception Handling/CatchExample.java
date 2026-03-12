// catch (ExceptionTpe variable)

public class CatchExample {
    public static void main(String[] args) {
        // int [] arr = {10,20,30};
        // System.out.println(arr[4]);

        try{
            int [] arr = {10,20,30};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Given Index does not exist");
        }
        System.out.println("Program continues......");
    }
}
