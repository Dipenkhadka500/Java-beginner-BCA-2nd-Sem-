import java.util.Scanner;
public class Temp2 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the temperature in fahrenheit:");
    double fah=sc.nextDouble();
    double cel=(fah-32)*5/9;
    System.out.println("The temperature in celcius is :"+cel);
    sc.close();
  }
}
