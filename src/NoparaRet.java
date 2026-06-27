import java.util.Scanner;
public class NoparaRet {
  String name;
  int roll;
  int marks;
  int display(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name:");
    name=sc.nextLine();
    System.out.println("Enter the roll number:");
    roll=sc.nextInt();
    System.out.println("Enter the marks obtained:");
    marks=sc.nextInt();
    sc.close();
    return marks;
  }
  public static void main(String[] args) {
    NoparaRet a=new NoparaRet();
    int result=a.display();
    System.out.println("Name: " + a.name);
    System.out.println("Roll No: " + a.roll);
    System.out.println("Marks: " + result);
  }
}
