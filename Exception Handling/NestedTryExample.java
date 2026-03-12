public class NestedTryExample {
    public static void main(String[] args) {
        try{
            int [] arr = {10,20,30};
            //System.out.println(arr[4]);
            System.out.println(arr[2]);

            try {
            int a = 10;
            int b = 0;
            int result = a/b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by ZERO.......");
            //System.out.println(e);
        }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Given Index does not exist");
            //System.out.println(e);
        }
    }
}
