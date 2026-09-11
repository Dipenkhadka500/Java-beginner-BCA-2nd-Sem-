import java.io.FileOutputStream;
import java.io.IOException;
public class ByteOutputStream {
  public static void main(String[] args) throws IOException{
    FileOutputStream fos=new FileOutputStream("Student.txt");
    String S="Hello, My name is Dipen Khadka";
    fos.write(S.getBytes());
    fos.close();
    System.out.println("Data written Successfully");
    }
}
