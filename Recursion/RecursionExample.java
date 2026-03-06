public class RecursionExample{

    static void fun(int n){
        if(n>0){
            System.out.println(n);
            fun(n-1);
        }
    }
    public static void main(String[] args) {
        int a = 5;
        fun(a);
    }
}