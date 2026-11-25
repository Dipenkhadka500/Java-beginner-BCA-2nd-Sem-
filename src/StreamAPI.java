import java.util.*;

public class StreamAPI{
  public static void main(String[] args){
    List<Integer> numbers=new ArrayList<>();
    numbers.add(10);
    numbers.add(2);
    numbers.add(5);
    numbers.add(50);
    numbers.add(20);

    numbers.stream()
    .sorted()
    .filter(number -> number>5)
    .forEach(number -> System.out.println(number));
  }
}