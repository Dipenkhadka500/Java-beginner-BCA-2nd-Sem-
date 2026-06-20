import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of terms:");
    int n=sc.nextInt();
    int a=0,b=1;
    int c=a+b;
    System.out.println("Fibonacci Series:");
    System.out.print(a+" "+b+" "+c+" ");
    for(int i=3;i<=n;i++){
      a=b;
      b=c;
      c=a+b;
      System.out.print(c+" ");
    }
    sc.close();
  }
  
}
