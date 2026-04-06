import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("demo.txt");
            FilterInputStream filter = new FilterInputStream(file) {
            };
            int data;
            while((data = filter.read()) != -1){
                System.out.print((char)data);
            }
            filter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
