import java.util.Scanner;

public class greater_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a= sc.nextInt();
        System.out.print("Enter secound Number : ");
        int b= sc.nextInt();
        sc.close();

        if(a>b){
            System.out.println("Number a is greatest number.");
        }else{
            System.out.println("Number b is greatest number.");
        }
    }
}
