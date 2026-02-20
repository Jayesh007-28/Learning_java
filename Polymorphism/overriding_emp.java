class Employee{
    String name;
    double BaseSalary;

    double claculatesalary(){
        return BaseSalary;
    }

    void showDetails(){
        System.out.println("Employee Name : "+name+" Salary : "+claculatesalary());
    }
}

class FulltimeEmployee extends Employee{
    double bonus;

    @Override
    double claculatesalary(){
        return BaseSalary + bonus;
    }
    @Override
    void showDetails(){
        System.out.println("Employee Name : "+name+" Salary : "+claculatesalary());
    }
}

class ParttimeEmployee extends Employee{
    double houseRent;

    @Override
    double claculatesalary(){
        return BaseSalary + houseRent;
    }
    @Override
    void showDetails(){
        System.out.println("Employee Name : "+name+" Salary : "+claculatesalary());
    }
}

class Intern extends Employee{
    int days;
    double perdaySalary;

    double claculatesalary(){
        return BaseSalary= days * perdaySalary;
    }

     @Override
    void showDetails(){
        System.out.println(" Salary : "+claculatesalary());
    }
    
}

public class overriding_emp{
    public static void main(String[] args) {
        Employee Emp = new FulltimeEmployee();

        Emp.name="Jayesh";
        Emp.BaseSalary=20000.00;

        ((FulltimeEmployee)Emp).bonus=5000.00;   // DownCasting

        Emp.showDetails();

        Intern In = new Intern();
        In.days=20;
        In.perdaySalary=500;

        In.showDetails();




    }
}
