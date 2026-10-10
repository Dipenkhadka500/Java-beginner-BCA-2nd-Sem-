import java.io.*;
public class FileWriterExample {
  public static void main(String[] args) throws IOException{
    FileWriter file=new FileWriter("teacher.txt");
    file.write("Hello My name is Dipen");
    file.close();
    System.out.println("Data Written Sucessfully");
    
  }
}
