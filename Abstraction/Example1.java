abstract class Vehicle {

    int noOfTyres;

    void dispalyTyres(){
        System.out.println(noOfTyres);
    }

    abstract void start();

}

class Car extends Vehicle{

    void start(){
        noOfTyres=4;
        System.out.println("Car is start......");
    }

}

class Bike extends Vehicle {

    void start(){
        noOfTyres=2;
        System.out.println("Bike is start");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.dispalyTyres();
      
        Vehicle bike = new Bike();
        bike.start();
        bike.dispalyTyres();
    }
}
