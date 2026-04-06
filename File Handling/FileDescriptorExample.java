import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class FileDescriptorExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("sample.txt");
        FileDescriptor fd = fos.getFD();
        System.out.println("Valid FD : "+fd.valid());
        fos.write("Hello".getBytes());
        fos.close();
    }
}
