class myTask1 implements Runnable{
    public void run(){
        System.out.println("Thread using Runnable....");
    }
}

public class MultithreadingUsingRunnable {
    public static void main(String[] args) {
        // myTask1 task = new myTask1();
        Runnable task = new myTask1();

        Thread t1 = new Thread(task);

        t1.start();
    }
}
