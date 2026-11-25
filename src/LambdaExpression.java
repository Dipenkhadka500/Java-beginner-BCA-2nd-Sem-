@FunctionalInterface
interface Vehicle{
  void run();
}
class Car{
  public void demo(){
    Vehicle v=() ->{
      System.out.println("Car is running");
    };
    v.run();
  }
}
public class LambdaExpression{
  public static void main(String[] args){
    Car c=new Car();
    c.demo();
  }
}