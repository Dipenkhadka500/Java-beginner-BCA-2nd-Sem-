//Demonstrate of copy constructor.
import java.util.Scanner;
public class Copycons {
  String name;
  int age;
  Copycons(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name:");
    name=sc.nextLine();
    System.out.println("Enter the age:");
    age=sc.nextInt();
    sc.close();
  }
  Copycons(Copycons C1){
    this.name=C1.name;
    this.age=C1.age;
  }
  void display(){
   System.out.println("Name:"+name);
   System.out.println("Age:"+age);
  }
  public static void main(String[] args) {
    Copycons C=new Copycons();
    Copycons C2=new Copycons(C);
    C2.display();
  } 
}
