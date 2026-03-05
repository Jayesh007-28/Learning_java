import java.util.Scanner;

public class voting_eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age= sc.nextInt();
        sc.close();

        if(age>=18){
            System.out.println("You are eligible for voting");
        }else{
            System.out.println("You are not eligible for voting");
        }
    }
}
