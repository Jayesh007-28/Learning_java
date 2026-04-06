
class Student {
    int id;
    String name;
    void display() {
        System.out.println("Id : "+id+" Name : "+name);
    }
}

public class ArrayofObject_ex {
    public static void main(String[] args) {
        Student [] obj = new Student[3];
        obj[0] = new Student();
        obj[0].id = 1;
        obj[0].name = "Jayesh";

        obj[1] = new Student();
        obj[1].id = 2;
        obj[1].name = "Yogesh nana";

        obj[2] = new Student();
        obj[2].id = 3;
        obj[2].name = "Lekhit";

        for(int i=0;i<obj.length;i++){
            obj[i].display();
        }
        
        for(Student s : obj){
            s.display();
        }
    }
}