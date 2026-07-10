class Person{
  String name;
  int age;
  String email;
  Person(String name,int age,String email){
    this.name=name;
    this.age=age;
    this.email=email;
  }
}
class Student extends Person{
  int roll_no;
  Student(String name,int age,String email,int roll_no){
    super(name,age,email);
    this.roll_no=roll_no;
  }
}
public class Example1{
  public static void main(String args[]){
    Student S=new Student("Dipen",24,"dipen.khadka@gmail.com",5);
    System.out.println("Name: "+S.name);
    System.out.println("Age: "+S.age);
    System.out.println("Email: "+S.email);
    System.out.println("Roll No: "+S.roll_no);
  }
}
    