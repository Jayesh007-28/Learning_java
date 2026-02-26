class Student{
    private int id;
    private String name;

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

public class Getters_Setters_ex{
    public static void main(String[] args) {
        Student Jayesh = new Student();

        Jayesh.setId(101);
        Jayesh.setName("Jayesh_jadhav");

        System.out.println(Jayesh.getId());
        System.out.println(Jayesh.getName());

        Student Obj = new Student();

        Obj.setId(102);
        Obj.setName("Lekhit");

        System.out.println(Obj.getId());
        System.out.println(Obj.getName());
    }
}