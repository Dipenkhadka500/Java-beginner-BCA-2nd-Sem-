import java.util.Scanner;
public class Age {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age:");
    int age=sc.nextInt();
    boolean voterId=true;
    if(age>=18){
      System.out.println("Your are an adult");
      if(voterId){
        System.out.println("You can vote"); 
      }
      else{
        System.out.println("you cannot vote");
      }
    }
    else{
      System.out.println("You are a minor");
    }
    sc.close();
  }
  
}
