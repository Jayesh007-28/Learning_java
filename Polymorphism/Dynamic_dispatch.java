class Phone{

    public void greet(){
        System.out.println("Good Morning.......");
    }

    public void name(){
        System.out.println("My name is java from base class....");
    }
}

class SmartPhone extends Phone{

    public void swagat(){
        System.out.println("Subh Sakal........");
    }

    @Override
    public void name(){
        System.out.println("My name is derived class........");
    }
}


public class Dynamic_dispatch {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.greet();
        obj.name();
        // obj.swagat();  //Not allow

        SmartPhone msg = new SmartPhone();
        msg.name();
        msg.swagat();
        msg.greet();

        Phone obj3 = new SmartPhone();
        obj3.name();
        obj3.greet();

        // obj3.swagat(); // Not allowed
 
        SmartPhone op = (SmartPhone)obj3;
        op.swagat();

        ((SmartPhone)obj3).swagat();
    }
}
