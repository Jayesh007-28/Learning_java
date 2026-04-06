
interface myInterface {
    void sayHello();
}

public class Lambda_ex {
    public static void main(String[] args) {
        myInterface my = new myInterface() {
            public void sayHello(){
                System.out.println("Good morning.");
            }
        };
        my.sayHello();

        myInterface obj = () -> {
            System.out.println("Hello Everyone! Good morning");
        };
        obj.sayHello();
    }
}