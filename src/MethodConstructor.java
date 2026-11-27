import java.util.function.*;
public class MethodConstructor {
MethodConstructor(){
  System.out.println("COnstructor Called");
}
  public static void main(String[] args){
    Supplier <MethodConstructor>  m=MethodConstructor::new;
    MethodConstructor obj = m.get();
  }
}