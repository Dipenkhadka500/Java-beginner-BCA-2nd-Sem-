public class Employee{
  String name;
  int id;
  int Salary;
  Employee(String name, int id, int Salary){
    this.name=name;
    this.id=id;
    this.Salary=Salary;
    System.out.println("Employee name: "+name); 
    System.out.println("Employee id: "+id);
    System.out.println("Employee Salary: "+Salary);
  }
  public static void main(String[] args){
    Employee E=new Employee("Dipen",5,20000);
  }
}