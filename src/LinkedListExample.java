import java.util.LinkedList;
public class LinkedListExample {
  public static void main(String[] args){
    LinkedList<String> list=new LinkedList<>();
    list.add("Dipen");
    list.add("Abhilesh");
    list.add("Diwash");
    System.out.println(list);
    list.addFirst("Ram");
    list.removeLast();
    System.out.println(list);
    System.out.println("My Name:"+list.get(1));
  }
}
