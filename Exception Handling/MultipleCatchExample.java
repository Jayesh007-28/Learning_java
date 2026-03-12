public class MultipleCatchExample {
    // catch (ExceptionTpe variable)


    public static void main(String[] args) {
        // int [] arr = {10,20,30};
        // System.out.println(arr[4]);

        try{
            int a = 10;
            int b = 0;
            int result = a/b;
            System.out.println(result);

            int [] arr = {10,20,30};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Given Index does not exist");
        } catch (ArithmeticException e){
            System.out.println("Can not divide by ZERO.......");
        }
        System.out.println("Program continues......");
    }
}


