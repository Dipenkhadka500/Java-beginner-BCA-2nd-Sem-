import java.util.Scanner;
public class Largest {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    int[] num=new int[5];
    System.out.println("Enter the elements:");
    for(int i=0;i<num.length  ;i++){
      num[i]=sc.nextInt();
    }
    int largest=num[0];
    for(int i=0;i<num.length;i++){
      if(num[i]>largest){
        largest=num[i];
      }
    }
    int sum=0;
    System.out.println(largest+" is a largest.");
    for(int i=0;i<num.length;i++){
      sum+=num[i];
    }
    System.out.println("Sum of the given integers is "+sum);
    sc.close();

  }
  
}
