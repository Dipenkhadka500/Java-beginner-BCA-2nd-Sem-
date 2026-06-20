import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int num=n;
    int rev=0;
    while(num!=0){
      int digit=num%10;
      rev=rev*10+digit;
      num=num/10;
    }
    if(n==rev){
      System.out.println(n+" is a palindrome number.");
    }
    else{
      System.out.println(n+" is not a palindrome number.");  
  }
  sc.close();
  }
  
}
