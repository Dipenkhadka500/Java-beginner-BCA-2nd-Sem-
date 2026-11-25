@FunctionalInterface
interface CalculatorApp{
  int mul(int a, int b);
}

public class LambdaExpression2 {
public static void main(String[] args){
  CalculatorApp c=(a,b) ->{
    return a*b;
  };
  System.out.println(c.mul(10,5));
}  
}
