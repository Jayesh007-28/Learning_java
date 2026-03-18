
class Task extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Started");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}

public class MultiJoin {
    public static void main(String[] args) throws Exception{
        Task t1 = new Task();
        Thread th = new Thread(t1,"FCT 1");
        Task t2 = new Task();

        th.start();
        th.join();
        t2.start();
        t2.join();
        System.out.println("Main Completed..");
    }
}
