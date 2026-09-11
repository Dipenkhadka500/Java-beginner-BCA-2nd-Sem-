import java.io.*;
import java.io.IOException;
public class ByteInputStream {
  public static void main(String[] args) throws IOException{
    FileInputStream fis=new FileInputStream("Student.txt");
    int i;
    while((i=fis.read())!=-1){
      System.out.print((char)i);
    }
    fis.close();
  }
}
