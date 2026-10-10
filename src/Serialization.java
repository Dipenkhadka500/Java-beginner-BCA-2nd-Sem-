/*import java.io.*;
class Student implements Serializable{
  String name;
  int roll;
  Student(String name,int roll){
    this.name=name;
    this.roll=roll;
  }
}
public class Serialization {
  public static void main(String[] args) throws IOException{
    Student s=new Student("Dipen",5);
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("dipen.ser"));
    out.writeObject(s);
    out.close();
    System.out.println("Object serialized successfully.");
  }
}*/
import java.io.*;
class Student implements Serializable{
  String name;
  int roll;
  Student(String name,int roll){
    this.name=name;
    this.roll=roll;
  }
}
public class Serialization{
  public static void main(String[] args) throws IOException{
    Student s=new Student("Programmer",10);
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Khadka.ser"));
    out.writeObject(s);
    out.close();
    System.out.println("Data Serialized Sucessfully");
  }
}


