class MyThread1 extends Thread{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.println("Thread Running : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class SleepExamplewithMultipleTask {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();

        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
