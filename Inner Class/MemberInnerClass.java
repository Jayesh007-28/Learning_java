/*
    syntax
    class outer{
        class Inner {
            Inner class code
        }
    }

*/

class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x : "+x);
        }
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {
       Outer obj = new Outer();
       Outer.Inner inner = obj.new Inner();
       
       inner.display();
    }
}