class Dog{
    // String name = "Tommy";
    String name;

    void Bark(){
        System.out.println(name +" Barking!");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.name= "Lekhit";
        obj.Bark();

    }
}