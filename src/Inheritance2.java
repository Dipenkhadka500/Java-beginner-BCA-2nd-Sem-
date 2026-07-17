class parent{
  String name;
  void show(){
    System.out.println(name+" is a student");
  }
}
class child1 extends parent{
  int age;
  void display(){
    System.out.println(age+" is age of "+name);
  }
}
class child2 extends child1{
  int marks;
  void print(){
    System.out.println(marks+" is marks of "+name+" whose age is "+age);
  }
}

public class Inheritance2 {
  public static void main(String[] args){
    child2 c=new child2();
    c.name="Dipen";
    c.age=24;
    c.marks=50;
    c.show();
    c.display();
    c.print();
  }
}
