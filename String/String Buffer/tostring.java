class Emp {
    int id;
    String name;

    public String toString() {
        return "Employee id : " + id + ", Name : " + name;
    }
}

public class tostring {
    public static void main(String[] args) {
        
        Emp obj = new Emp();
        obj.id=1;
        obj.name="Jayesh";
        System.out.println(obj);
    }
}
