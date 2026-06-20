import java.util.Scanner;
public class Cinterest {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the principal amount:");
    double p=sc.nextDouble();
    System.out.println("Enter the rate of interest:");
    double r=sc.nextDouble();
    System.out.println("Enter the time in years:");
    int t=sc.nextInt();
    double CI=p*Math.pow(1+(r/100),t)-p;
    System.out.println("The compound interest is:"+CI);
    sc.close();
  }
  
}
