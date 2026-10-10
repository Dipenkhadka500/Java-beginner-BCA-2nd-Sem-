import java.io.*;
public class RandomAccessExample {
  public static void main(String[] args) throws IOException{
    RandomAccessFile file=new RandomAccessFile("student.txt","rw");
    file.writeUTF("My name is Dipen");
    file.writeUTF("My age is 24");
    file.writeInt(5);
    file.seek(0);
    String name=file.readUTF();
    System.out.println("Name:"+name);
    file.seek(18);
    String age=file.readUTF();
    System.out.println("Age:"+age);
    file.seek(32);
    int roll=file.readInt();
    System.out.println("Roll:"+roll);
    file.close();
  }
}
