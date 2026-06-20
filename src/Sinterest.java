import java.util.*;
public class Sinterest {
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the principal amount:");
  double principal=sc.nextDouble();
  System.out.println("Enter the rate of interest:");
  double rate=sc.nextDouble();
  System.out.println("enter the time in years:");
  double time=sc.nextDouble();
  double SI=(principal*rate*time)/100;
  System.out.println("The simple interest is:"+SI);
  sc.close();
  }
}
