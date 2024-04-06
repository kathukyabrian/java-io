import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream finput = null;
        FileOutputStream foutput = null;

        try {
            finput = new FileInputStream("file1.txt");
            foutput = new FileOutputStream("file2.txt");

            byte[] data = finput.readAllBytes();
            foutput.write(data);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (finput != null) {
                    finput.close();
                }
                if (foutput != null) {
                    foutput.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}