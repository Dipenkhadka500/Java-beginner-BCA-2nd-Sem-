import java.util.Scanner;
public class Paranoret {
  
  void display(String name, int roll, int marks){
    System.out.println("Name:"+name);
    System.out.println("Roll:"+roll);
    System.out.println("Marks:"+marks);
    
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name:");
    String name=sc.nextLine();
    System.out.println("Enter the roll number:");
    int roll=sc.nextInt();
    System.out.println("Enter the Marks:");
    int marks=sc.nextInt();
    Paranoret a=new Paranoret();
    a.display(name,roll,marks);
    sc.close();
  }
  
}
