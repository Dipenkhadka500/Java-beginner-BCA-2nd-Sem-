
public class ThrowExample{
  public static void main(String[] args){
    try{
      int age=16;
      if(age<18){
        throw new ArithmeticException("Age must be 18 or above");
      }
    }
    catch(ArithmeticException e){
      System.out.println("Exception Occurred:"+e.getMessage());
    }
  }
}