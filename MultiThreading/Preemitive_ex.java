public class Preemitive_ex extends Thread {
    public Preemitive_ex(String name , int priority){
        super(name);
        setPriority(priority);
    } 

    public void run(){
        System.out.println(getName() + " with priority "+ getPriority() + " is running");
    }
    
    public static void main(String[] args) {
        Preemitive_ex t1 = new Preemitive_ex("Thread 1", 3);
        Preemitive_ex t2 = new Preemitive_ex("Thread 2", 7);
        Preemitive_ex t3 = new Preemitive_ex("Thread 3", 5);
        Preemitive_ex t4 = new Preemitive_ex("Thread 4", 7);
        Preemitive_ex t5 = new Preemitive_ex("Thread 5", 2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
/*  usually high prority thread runs first but not guranted.
 min priority = 1 to 4
 normal = 5
 high = 6 to 10
*/