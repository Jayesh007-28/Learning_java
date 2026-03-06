public class RecursionExample2 {
    static void fun(int n){
        if(n>0){
            fun(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int a=5;
        fun(a);
    }
}
