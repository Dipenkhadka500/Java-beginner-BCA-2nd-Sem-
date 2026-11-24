class LibraryManager{
  private static LibraryManager instance;

  private LibraryManager(){
    System.out.println("LibraryManager Object is Created");
  }
  public static LibraryManager getInstance(){
    if(instance==null){
      instance= new LibraryManager();
    }
    return instance;
  }
  public void display(){
    System.out.println("Welcome to the Library");
  }
}
public class SingletonPattern{
  public static void main(String[] args){
    LibraryManager Student1= LibraryManager.getInstance();
    LibraryManager Student2= LibraryManager.getInstance();
    Student1.display();
    System.out.println("Are both instances the same? " + (Student1 == Student2));
  }
}