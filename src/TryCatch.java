public class TryCatch {
  public static void main (String[] args){
    try{
      int a=10;
      int b=2;
      int c=a/b;
      System.out.println("Result:"+c);
    }
    catch(ArithmeticException e){
      System.out.println("Number can not be divided by zero");
    }
    finally{
      System.out.println("This is finally block");
    }
    System.out.println("Program is terminated");
  }
}
