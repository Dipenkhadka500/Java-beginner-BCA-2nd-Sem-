import java.util.Scanner;
public class Multiplication{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    System.out.println("Multiplication table of "+num+" is:");
    for(int i=1;i<=10;i++){
      int result=num*i;
      System.out.println(num+"*"+i+"="+result);
    }
    sc.close();
  }
}