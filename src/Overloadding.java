public class Overloadding {
  String name;
  int roll;
  String address;
  void add(String name,int roll){
    this.name=name;
    this.roll=roll;
    System.out.println("Student name: "+name);
    System.out.println("Student roll: "+roll);  
  }
  void add(String name,int roll,String address){
    this.name=name;
    this.roll=roll;
    this.address=address;
    System.out.println("Student name: "+name);
    System.out.println("Student roll: "+roll);
    System.out.println("Student address: "+address);
  }
  public static void main(String[] args){
    Overloadding  o=new Overloadding();
    o.add("Dipen",5);
    o.add("Dipen",5,"Biratnagar");
  }
}
