import java.util.Scanner;
public class Noparanoret {
  String name;
  public void display(){
    System.out.println("Enter the name:");
    Scanner sc=new Scanner(System.in);
    name=sc.nextLine();
    System.out.println("Name:"+ name);
    sc.close();
  }
  public static void main(String[] args) {
    Noparanoret a=new Noparanoret();
    a.display();
  }
}
