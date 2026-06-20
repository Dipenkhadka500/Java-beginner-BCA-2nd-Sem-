import java.util.Scanner;
public class Grade {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks:");
    float marks=sc.nextFloat();
    if(marks<100 && marks>=90){
      System.out.println("A+");
    }
      else if(marks<90 && marks>=80){
        System.out.println("A");
      }
        else if(marks<80 && marks>=70){
          System.out.println("B+");
        }
          else {
            System.out.println("Fail");
          }
      sc.close();
    }
    
  }
  

