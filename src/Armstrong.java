import java.util.Scanner;
public class Armstrong {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int num=n;
    int org=num;
    int sum=0;
    int count=0;
    while(num!=0){
      int digit=num%10;
      count++;
      num=num/10;
    }
    while(n!=0){
      int digit=n%10;
      sum+=Math.pow(digit,count);
      n=n/10;
    }
    if(sum==org){
      System.out.println(org+" is an Armstrong number.");
    }
    else{
      System.out.println(org+" is not an Armstrong number."); 
  }
  sc.close();
}
}
