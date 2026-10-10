import java.util.ArrayList;
public class ArrayListExample{
  public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(5);
    list.add(3);
    list.add(2);
    System.out.println(list);
    System.out.println("After sorting");
    list.sort(null);
    System.out.println(list);
    System.out.println("My Number:"+list.get(2));
    list.add(6);
    list.remove(2);
    System.out.println("New Sorting");
    list.sort(null);
    System.out.println(list);
  }
}