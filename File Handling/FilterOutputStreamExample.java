import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("demo.txt");
            FilterOutputStream fout = new FilterOutputStream(fos);

            fout.write('A');
            String data = "Hello Java";
            fout.write(data.getBytes());
            fout.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
