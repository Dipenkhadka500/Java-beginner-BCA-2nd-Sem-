import java.util.Scanner;
class Subtraction{
  int sub(int a,int b){
    return a-b;
  }
  int sub(int a,int b,int c){
    return a-b-c;
  }
  double sub(double a,double b){
    return a-b;
  }
}
public class Overloading {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    Subtraction S=new Subtraction();
    int x=S.sub(a, b);
    System.out.println("Subtraction1:"+x);
    int y=S.sub(a, b, c);
    System.out.println("Subtraction2:"+y);
    double z=S.sub(5.5, 4.5);
    System.out.println("Subtraction3:"+z);
    sc.close();
  }
}
