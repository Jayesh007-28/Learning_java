import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
            String message = "Java File I/O Example";
            fos.write(message.getBytes());
            fos.close();
            System.out.println("Data written successfully");

            FileInputStream fis = new FileInputStream("sample.txt");
            int data;
            System.out.print("File content : ");
            while ((data = fis.read()) != -1) {
                System.out.print((char)data);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
