import java.util.Scanner;
public class Square {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the square:");
    double length=sc.nextDouble();
    double area=length*length;
    double perimeter=4*length;
    System.out.println("The area of the square is:"+area);
    System.out.println("The perimeter of the square is:"+perimeter);
    sc.close();
  }
}
