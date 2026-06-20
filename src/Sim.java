import java.util.Scanner;
public class Sim {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the USSD code:");
    String code=sc.nextLine();
    if(code.equals("*123#"))
    {
      System.out.println("============Welcome to the network Services==========");
      System.out.println("1.Exclusive offers");
      System.out.println("2.Sadhain On Pack");
      System.out.println("3.Unlimited voice pack");
      System.out.println("4.SMS pack");
      System.out.println("5.Sapatti");
      System.out.println("6.Data Pack");

      System.out.println("Enter the choice(1-6):");
      int choice1=sc.nextInt();
      sc.nextLine();
      switch(choice1){
        case 1:
          System.out.println("1.Rs40-7Gb data for 3 days");
          System.out.println("2.Rs100-10Gb data for 7 days");
          System.out.println("3.Rs299-15Gb data for 30 days");

          System.out.println("Enter your choice(1-3):");
          int choice2=sc.nextInt();
          
          sc.nextLine();
          switch(choice2){
            case 1:
              System.out.println("Your 7Gb data pack is activated for 3 days.");
              break;
              case 2:
              System.out.println("Your 10Gb data pack is activated for 7 days.");
              break;
              case 3:
              System.out.println("Your 15Gb data pack is activated for 30 days.");
              break;
              default:
              System.out.println("Invalid choice");
              break;
          }
          break;
        case 2:
            System.out.println("1.afjbsahfh");
            System.out.println("2.affjaf");
            int choice3=sc.nextInt();
            switch(choice3){
              case 1:
                System.out.println("Your afjbsahfh pack is activated for 3 days.");
                break;
                case 2:
                System.out.println("Your affjaf pack is activated for 7 days.");
                break;
                default:
                System.out.println("Invalid choice");
                break;
            }
      }
    }
    sc.close();
  }
  
}
