import java.util.Scanner;
public class ArgsRet {
  int display(String name, int roll, int marks){
    if (marks>32) {
      System.out.println("Student is pass");
    }
    else{
      System.out.println("Student is fail");
    }
    return marks;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name:");
    String name=sc.nextLine();
    System.out.println("Enter the roll:");
    int roll=sc.nextInt();
    System.out.println("Enter the marks:");
    int marks=sc.nextInt();
    ArgsRet a=new ArgsRet();
    int result=a.display(name,roll,marks);
    System.out.println("Obtained marks:"+result);
    sc.close();
  }
}
