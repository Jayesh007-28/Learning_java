class Table1 {
 
    synchronized void printTable(int n) {
 
        System.out.println(Thread.currentThread().getName() + " started");
 
        synchronized (this) {
            
            for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
 
            try {
                Thread.sleep(500); // simulating delay
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        }
        
 
        System.out.println(Thread.currentThread().getName() + " finished\n");
    }
}
 
public class BlockSynchronizationExample {
 
    public static void main(String[] args) {
 
        Table1 obj = new Table1(); // shared object
 
        // Thread 1
        Thread t1 = new Thread(() -> obj.printTable(2), "Thread-1");
 
        // Thread 2
        Thread t2 = new Thread(() -> obj.printTable(5), "Thread-2");
 
        t1.start();
        t2.start();
    }
}