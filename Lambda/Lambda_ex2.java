
interface Calculator {
    int add(int a , int b);
}

public class Lambda_ex2 {
    public static void main(String[] args) {
        Calculator cal = (a,b) -> a+b;
        
        System.out.println(cal.add(10,20));
    }
}
