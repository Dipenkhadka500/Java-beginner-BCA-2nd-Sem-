import java.util.Scanner;
public class Prime {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int a=sc.nextInt();
    int count=0;
    if(a<=1){
      System.out.println(a+" is neither prime nor composite.");
    }
    for(int i=1;i<=a;i++){
      if(a%i==0){
        count++;
      }
    }
    if(count==2){
      System.out.println(a+" is a prime number.");
    }
    else{
      System.out.println(a+" is a composite number.");
    }
    sc.close();
  }
  
}
