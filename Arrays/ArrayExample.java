public class ArrayExample {
    public static void main(String[] args) {
        int [] num = new int[5];
        
        num[0] = 40;
        num[1] = 41;
        num[2] = 42;
        num[3] = 43;
        num[4] = 44;

        // for(int i=0;i<num.length;i++){
        //     System.out.println(num[i]);
        // }

        // Enhanced for loop --> for each
        
        for(int arr : num){
            System.out.println(num);   // prints the address of array
            System.out.println(arr);   // prints the elements of array
        }
    }
}