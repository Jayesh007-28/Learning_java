public class Employee {

    String name;
    double salary;

    Employee(String name , double salary){
        this.name=name;
        this.salary=salary;
        System.out.println("Parametrized Construtor called.........");
    }   

    Employee(Employee emp){
        this.name=emp.name;
        this.salary=emp.salary;
        System.out.println("Copy constructor Called.........");
    }
     
    
    
    void Employee_details(){
        System.out.println("Employee Name is : "+name+" and salary is : "+salary);
    }
    public static void main(String[] args) {
        System.out.println("Code started.......");
        Employee obj = new Employee("Jayesh", 25000);
        Employee Copyobj = new Employee(obj);

        Copyobj.name="Nana";

        obj.Employee_details();
        Copyobj.Employee_details();
    } 
}
