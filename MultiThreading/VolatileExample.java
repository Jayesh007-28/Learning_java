
class SharedData{
    volatile boolean flag = false;
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Thread writer = new Thread( () -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            data.flag=true;
            System.out.println("Writer thread changed flag to true");
        });
        Thread reader = new Thread( () -> {
            while(!data.flag){
                //wait until flag becomes true
            }
            System.out.println("Reader thread saw flag = true");
        });
        writer.start();
        reader.start();
    }
}

//Problem here : Sometimes reader thread may never see the change made by writer thread and may run indefinitely . this is because without vo;atile, there is no guarntee that the reader thread will see the updated value of flag