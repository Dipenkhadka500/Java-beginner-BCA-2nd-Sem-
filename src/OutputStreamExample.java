import java.io.*;
public class OutputStreamExample {
  public static void main(String[] args) throws IOException{
    DataOutputStream dos=new DataOutputStream(new FileOutputStream("student.txt"));
    dos.writeUTF("Dipen");
    dos.writeInt(5);
    dos.close();
    System.out.println("Data Written Successfully");
  }
}
