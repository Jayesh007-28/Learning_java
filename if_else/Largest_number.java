import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int a = sc.nextInt();

        System.out.print("Enter second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter third Number : ");
        int c = sc.nextInt();

        if(a >= b && a >= c){
            System.out.println("A is largest number");
        }
        else if(b >= a && b >= c){
            System.out.println("B is largest number");
        }
        else{
            System.out.println("C is largest number");
        }

        sc.close();
    }
}