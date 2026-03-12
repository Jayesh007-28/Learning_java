import java.io.*;

public class ThrowsExample {

    public static void readfile () throws IOException {
        FileReader file = new FileReader("notes.txt");
    }
    public static void main(String[] args)  throws IOException{
        readfile();
    }
}
