class Employee {
    String Company;

    Employee(String Company){
    // Employee(){
        this.Company=Company;
        System.out.println("Employee Constructor Called...");
    }

    void getDetails(){
        System.out.println("Company : "+Company);
    }
}

class Manager extends Employee{
    String department;

    Manager(String Company,String department){
        super(Company);
        this.department=department;

        System.out.println("Manager Constructor called..");
    }

    void getDetails(){
        super.getDetails();
        System.out.println("Department : "+department);
    }
}

public class super_Key {
    public static void main(String[] args) {
        Manager data = new Manager("Accenture", "Software Developer");

        data.getDetails();
    }
}