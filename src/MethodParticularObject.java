import java.util.*;
public class MethodParticularObject {
  void display(String name){
    System.out.println(name);
  }
  public static void main(String[] args){
    MethodParticularObject obj  = new MethodParticularObject();
    List<String> names = Arrays.asList("Dipen","Abhilesh","Sajal");
    names.stream()
    .forEach(obj::display);
  }
}
