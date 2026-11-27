import java.util.*;
public class MethodArbitary {
  public static void main(String[] args){
    List<String> names =Arrays.asList("Dipen","Abhilesh","Sajal");
    names.stream()
    .map(String::toUpperCase)
    .forEach(System.out::println);
  }
}
