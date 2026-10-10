/*import java.io.*;
public class Deserialization {
  public static void main(String[] args) throws IOException,ClassNotFoundException{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("Dipen.ser"));
    Student s=(Student) in.readObject();
    in.close();
    System.out.println("Name:"+s.name);
    System.out.println("Roll:"+s.roll);
  }
}*/
import java.io.*;
public class Deserialization{
  public static void main(String[] args) throws IOException, ClassNotFoundException{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("Khadka.ser"));
    Student s=(Student) in.readObject();
    in.close();
    System.out.println("Name:"+s.name);
    System.out.println("Roll:"+s.roll);

  }
}
