import java.io.*;
public class FileReaderExample {
  public static void main(String[] args) throws IOException{
    FileReader F=new FileReader("teacher.txt");
    int ch;
    while((ch=F.read())!=-1){
      System.out.print((char)ch);
    }
    F.close();

  }
}
