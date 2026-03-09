public class CallByVlaue{
    public static void changeValue(int x){
        x=50;
        System.out.println("Value of x : "+x);
    }
    public static void main(String[] args) {
        int num=10;
        changeValue(num);
        System.out.println("Value of num : "+num);
    }
}