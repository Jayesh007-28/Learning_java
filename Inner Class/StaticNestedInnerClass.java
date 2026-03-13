
class Outer {
    static int data = 50;

    static class Inner{
        void display(){
            System.out.println("Data : "+data);
        }
    }
}

public class StaticNestedInnerClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();

        obj.display();
    }
}
