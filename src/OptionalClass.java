import java.util.*;
public class OptionalClass {
  public static void main(String[] args){
    Optional<String> O = Optional.ofNullable("Dipen");
    System.out.println(O.isPresent());
    System.out.println(O.get());
    System.out.println(O.orElse("Unknown"));
    O.ifPresent(n -> System.out.println(n));
    
    Optional<String> obj= Optional.ofNullable(null);
    String name= obj.orElseThrow(() -> new RuntimeException("Name not found"));
    System.out.println(name);
  }
  
}
