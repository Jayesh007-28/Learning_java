import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int a= sc.nextInt();

        System.out.print("Enter Secound Number : ");
        int b= sc.nextInt();

        System.out.print("Enter a character: ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("Addition = "+(a+b));
                break;

            case '-':
                System.out.println("Substraction = "+(a-b));
                break;

            case '*':
                System.out.println("Multiplication = "+(a*b));
                break;

            case '/':
                System.out.println("Division = "+(a/b));
                break;

            case '%':
                System.out.println("Mod = "+(a%b));
                break;

            default:
                System.out.println("Invalid Operator......!");
        }
    }
}
