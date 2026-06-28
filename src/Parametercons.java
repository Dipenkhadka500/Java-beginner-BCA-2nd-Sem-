import java.util.Scanner;
public class Parametercons {
  String name;
  int age;
  double marks;
  Parametercons(String name, int age, double marks){
    this.name=name;
    this.age=age;
    this.marks=marks;
    
  }
  void display(){
    System.out.println("Name:"+this.name);
    System.out.println("Age:"+this.age);
    System.out.println("Marks:"+this.marks);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name:");
    String name=sc.nextLine();
    System.out.println("Enter the age:");
    int age=sc.nextInt();
    System.out.println("Enter the marks obtained:");
    double marks=sc.nextDouble();
    Parametercons P =new Parametercons(name,age,marks);
    P.display();
    sc.close();
  }
}
