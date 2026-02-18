//========================1.Method with no return Types========================
// public class Methods_type {
//     public void name(){
//         System.out.println("Jayesh");
//     }
//     public static void main(String[] args) {
//         Methods_type obj = new Methods_type();
//         obj.name();
//     }
// }

//=======================2.Method with return parameter==========================

// public class Methods_type{
//     public int name(){
//         System.out.println("Fct");
//         int data = 10;
        
//         return 0;
//     }
//     public static void main(String[] args) {
//         Methods_type obj = new Methods_type();
//         int result = obj.name();
//         System.out.println(result);
//     }
// }


//==========================3.Method with parameter ==========================

public class Methods_type{
    public int add(int num1, int num2){
        int result = num1 + num2;

        return result;
    }
    public static void main(String[] args) {
        Methods_type obj = new Methods_type();
        int res = obj.add(10, 20);
        System.out.println(res); 
    }
}