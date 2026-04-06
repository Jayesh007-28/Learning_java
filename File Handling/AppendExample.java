import java.io.FileOutputStream;


public class AppendExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("demo.txt", true);
            String text = "\nThis line is appended";
            fos.write(text.getBytes());
            fos.close();
            System.out.println("Data appended successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
