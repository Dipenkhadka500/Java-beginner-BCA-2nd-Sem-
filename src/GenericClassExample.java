/*class Student<T>{
  T data;
Student(T data){
  this.data=data;
}
public void show(){
  System.out.println("Data:"+data);
}
}
public class GenericClassExample {
  public static void main(String[] args){
    Student<Integer> S=new Student<>(10);
    S.show();
    Student<String> S1=new Student<>("Dipen");
    S1.show();
  }
}
*/
class Teacher<T>{
  T data;
  Teacher(T data){
    this.data=data;
  }
  public void show(){
    System.out.println("Data:"+data);
  }
}
public class GenericClassExample{
  public static void main(String[] args){
    Teacher<Integer> D=new Teacher<>(10);
    D.show();
    Teacher<String> D1=new Teacher<>("Dipen");
    D1.show();
  }
}