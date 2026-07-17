class parent{
  String name;
  void show(){
    System.out.println(name+" is a parent class");
  }
}
class child extends parent{
  String address;
  void display(){
    System.out.println(name+ " has a child class with address "+address);
  }
}
public class Inheritance1 {
  public static void main(String[] args){
    child c=new child();
    c.name="Dipen";
    c.address="Biratnagar";
    c.display();
    c.show();
  }
}
