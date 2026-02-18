// package Constructors;

public class Constructor_Examples{
    String name;

    // void setName(String name){
    //     this.name=name;
    // }

    Constructor_Examples(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        Constructor_Examples obj = new Constructor_Examples("Jayesh_Jadhav");
        // obj.setName("Jayesh");
        System.out.println(obj.name);
    }
}