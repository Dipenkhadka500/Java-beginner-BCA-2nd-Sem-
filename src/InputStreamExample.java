import java.io.*;
public class InputStreamExample {
  public static void main(String[] args) throws IOException{
    DataInputStream dis=new DataInputStream(new FileInputStream("student.txt"));
    String name=dis.readUTF();
    int roll=dis.readInt();
    dis.close();
    System.out.println("Name:"+name);
    System.out.println("Roll:"+roll); 
  }
}
