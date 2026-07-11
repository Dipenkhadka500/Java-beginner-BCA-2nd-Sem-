
class Animal{
  void Sound(){
    System.out.println("Animal has different sound");
  }
}
class Dog extends Animal{
  @Override
  void Sound(){
    System.out.println("Dog Barks");
  }
}
class Cat extends Animal{
  @Override
  void Sound(){
    System.out.println("Cat Meows");
  }
}
public class Overriding {
  public static void main(String[] args) {
    Animal A1=new Dog();
    A1.Sound();
    Animal A2=new Cat();
    A2.Sound();
  }
}
