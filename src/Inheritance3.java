class parent{
  String name;
  void show(){
    System.out.println(name+" is a parent class");
  }
}
class child1 extends parent{
  String address;
  void display(){
    System.out.println(""+name+" has a child class with address "+address);
  }
}
class child2 extends parent{
  int marks;
  void print(){
    System.out.println(""+name+" has a child class with marks "+marks);
  }
}
public class Inheritance3 {
  public static void  main(String[] args){
    child1 c1=new child1();
    c1.name="Dipen";
    c1.address="Biratnagar";
    c1.show();
    c1.display();
    child2 c2=new child2();
    c2.name="Abhilesh";
    c2.marks=50;
    c2.show();
    c2.print();

  }
}
