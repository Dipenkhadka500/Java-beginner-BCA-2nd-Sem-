//Static method reference.
import java.util.*;
public class ReferenceStaticMethod{
  static void display(String name){
    System.out.println("Hello"+name);
  }
  public static void main(String[] args){
    List<String> s= Arrays.asList("Dipen","Sajal");
    s.stream()
    .forEach(ReferenceStaticMethod::display);
  }
}