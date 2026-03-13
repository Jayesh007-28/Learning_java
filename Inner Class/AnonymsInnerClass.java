
// interface Greeting {
//     void sayHello();
// }

// public class AnonymsInnerClass {
//     public static void main(String[] args) {
//         Greeting obj = new Greeting() {
//             public void sayHello() {
//                 System.out.println("Hello Jayesh...");
//             }
//         };

//         obj.sayHello();
//     }
// }

abstract class Greeting {
    abstract void display();
}

public class AnonymsInnerClass {
    public static void main(String[] args) {
        Greeting obj = new Greeting() {
            public void display(){
                System.out.println("Hi Jayesh...");
            }
        };

        obj.display();
    }
}