public class SleepExample {
    public static void main(String[] args) {
        try {
            System.out.println("Program Started");
            Thread.sleep(5000);
            System.out.println("Program Resumed After 5 Seconds");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
