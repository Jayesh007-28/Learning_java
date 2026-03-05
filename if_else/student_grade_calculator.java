import java.util.Scanner;

public class student_grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int marks= sc.nextInt();
        sc.close();

        if(marks>=90){
            System.out.println("A Grade");
        }else if(marks>=75){
            System.out.println("B Grade");
        }else if(marks>=60){
            System.out.println("C Grade");
        }else if(marks>=40){
            System.out.println("D Grade");
        }else{
            System.out.println("Fail");
        }
    }
}
