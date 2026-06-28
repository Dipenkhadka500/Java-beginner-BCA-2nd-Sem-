import java.util.Scanner;
public class Defaultcons {
  int a;
  int b;
  int sum;
  int mul;
  Defaultcons(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the any two numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    sc.close();
  }
  void show(){
    sum=a+b;
    mul=a*b;
    System.out.println("Sum:"+sum);
    System.out.println("Multiplication:"+mul);
  }
  public static void main(String[] args) {
    Defaultcons D=new Defaultcons();
    D.show();
  
  }
}
