import java.util.Scanner;
public class Temp1 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the temperature in celcius:");
    double celcius=sc.nextDouble();
    double fah=(celcius*9/5)+32;
    System.out.println("The temperature in fahrenheit is:" + fah);
    sc.close();

  }
}
