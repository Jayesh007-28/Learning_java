public class temperature_category {
    public static void main(String[] args) {
        int temp = 8;

        if(temp>=10 && temp<25){
            System.out.println("Temperature is moderate.");
        }else if(temp > 25){
            System.out.println("Temperature is Hot.");
        }else{
            System.out.println("Temperature is very cold.");
        }
    }
}
