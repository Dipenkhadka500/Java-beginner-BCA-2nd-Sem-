import java.io.*;
public class ThrowsExample {
  public static void main(String[] args) throws IOException ,FileNotFoundException{
    FileReader file=new FileReader("abc.txt");
    int ch;
    while((ch=file.read())!=-1){
      System.out.println((char)ch);
    }
    file.close();
    System.out.println("Data Read Successfully");
  }
}
