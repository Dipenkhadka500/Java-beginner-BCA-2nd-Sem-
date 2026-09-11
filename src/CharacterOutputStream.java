import java.io.*;
import java.io.IOException;
public class CharacterOutputStream {
  public static void main(String[] args) throws IOException{
    FileWriter fw= new FileWriter("Teacher.txt");
    fw.write("Hello, My name is Dipen Khadka");
    fw.close();
    System.out.println("Data written Successfully");
  }
}
