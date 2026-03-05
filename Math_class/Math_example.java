public class Math_example{
    public static void main(String[] args) {

        int num1=10;
        int num2=20;

        // Maximum Number
        int max_Value = Math.max(num1, num2);
        System.out.println("Maximun number : "+max_Value);

        // Minmum Number
        int min_Value = Math.min(num1, num2);
        System.out.println("Minmum Number : "+min_Value);

        // Square Root
        double sqrt_Vlaue = Math.sqrt(4);
        System.out.println("Squre Root : "+sqrt_Vlaue);

        // Power 
        double power_Value = Math.pow(2, 3);
        System.out.println("Power : "+power_Value);

        // Abosule Value
        int abs_Value = Math.abs(-23);
        System.out.println("Aboulte Vlaue : "+abs_Value);

        // Random Number
        double random_Value = Math.random();
        System.out.println("Random Number : "+random_Value);

        // Rounding 
        double num = 5.5;
        double round_Vlaue = Math.round(num);
        System.out.println("Round Number : "+round_Vlaue);
    }
}