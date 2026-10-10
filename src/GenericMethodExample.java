
/*public class GenericMethodExample {
  public static<T> void show(T data){
    System.out.println("Data:"+data);
  }
  public static void main(String[] args){
    show(10);
    show("Dipen");
  }
}*/
public class GenericMethodExample{
  public static<T> void show(T item){
    System.out.println("Data:"+item);
  }
  public static void main(String[] args){
    show("Apple");
    show(10.5);
  }
}
