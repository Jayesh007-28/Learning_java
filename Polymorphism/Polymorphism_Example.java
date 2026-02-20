class Animal{
    void sound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Polymorphism_Example{
    public static void main(String[] args) {
       Dog d = new Dog();
       d.sound(); 

       Animal a = new Dog();
        a.sound();
    }
}
