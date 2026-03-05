import java.util.*;

public class positive_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n= sc.nextInt();

        if(n>=0){
            if(n==0){
                System.out.println("Number is zero");
            }else{
                System.out.println(n+" is positive number.");
            }
        }else{
            System.out.println(n+" is negative number.");
        }
    }
}