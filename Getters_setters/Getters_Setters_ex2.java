class Employee{
    private double salary;

    public void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Invalid Amount .........!!!");
        }
    }

    public double getSalary(){
        return salary;
    }
}

public class Getters_Setters_ex2 {
    public static void main(String[] args) {
        
        Employee Emp = new Employee();

        Emp.setSalary(70000.00);
        System.out.println("Salary : "+Emp.getSalary());

        Employee Emp1 = new Employee();

        Emp1.setSalary(-70000);
        System.out.println("Salary : "+Emp1.getSalary());
    }
}
