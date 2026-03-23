public class ShutdownHookExample {
    public static void main(String[] args) {
        
        Thread hook = new Thread(() -> {
            System.out.println("Shutdown hook is running....");
            System.out.println("Claening resources...");
        });
        Runtime.getRuntime().addShutdownHook(hook);
        System.out.println("Main method is running...");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main method completed...");
    }
}
