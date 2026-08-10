public class Handling {
  int a=10;
  int b=0;
  void divide(){
    try{
      int c=a/b;
    }
    catch(ArithmeticException e){
      System.out.println("We cannot divide a number by zero");
    }
    finally{
      System.out.println("This is the end of the program");
    }
  }
  public static void main(String[] args){
    Handling h=new Handling();
    h.divide();
  }
}
