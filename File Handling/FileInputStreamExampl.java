import java.io.FileInputStream;

public class FileInputStreamExampl {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("demo.txt");
            int i;
            while((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
