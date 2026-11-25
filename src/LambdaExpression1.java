@FunctionalInterface
interface Calculator{
  int add(int a, int b);
}
public class LambdaExpression1{
  public static void main(String[] args){
    Calculator c=(a,b) ->{
      return a+b;
    };
    System.out.println(c.add(10,5));
  }
}