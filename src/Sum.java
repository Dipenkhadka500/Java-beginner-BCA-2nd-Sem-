import java.util.Scanner;
public class Sum {
  public static void main(String[] args){
    Scanner sum=new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1=sum.nextInt();
    System.out.println("Enter the second number:");
    int num2=sum.nextInt();
    int result=num1+num2;
    System.out.println("The sum is:"+result);
    sum.close();
  } 
}
