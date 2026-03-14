class FctThread extends Thread {
    public void run() {
        System.out.println("FCT thread is running......");
    }
}

public class MultithreadingUsingThreadClass {
    public static void main(String[] args) {

        // The following example shows how to create custom thread
        FctThread t1 = new FctThread();
        t1.start(); // start new thread

        Thread t2 = new Thread();
        t2.start();

        Thread t3 = new Thread("FCT thread");
        System.out.println(t3.getName());
    }
}
