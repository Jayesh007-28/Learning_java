/*
  Syntax 

   class outer{
        void show(){
            class Inner{
                inner class code
            }
        }
   }
*/

class Outer {
    void display(){
        class Inner {
            void message() {
                System.out.println("Welcome To FCT....!");
            }
        }
        Inner obj = new Inner();
        obj.message();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
    }
}
