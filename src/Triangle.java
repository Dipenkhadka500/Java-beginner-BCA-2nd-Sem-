import java.util.Scanner;
public class Triangle {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   
    System.out.println("Enter the sides of the triangle:");
    double side1=sc.nextDouble();
    double side2=sc.nextDouble();
    double side3=sc.nextDouble();
    double s=(side1+side2+side3)/2;
    double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    System.out.println("Area of the triangle is:"+area);
     sc.close();
  }
  
}
