/* 
import java.util.Scanner;
public class WrapperClass{
  void display(){
    System.out.println("Enter a Number");
    Scanner sc= new Scanner(System.in);
    int a =sc.nextInt();

    Integer i=Integer.valueOf(a);
    System.out.println("Primitive value: "+a);
    System.out.println("Wrapper Object:"+i);
    sc.close();
}
}*/
/* 
void show(){
   System.out.println("Enter a number");
   Scanner sc=new Scanner(System.in);
   int i=sc.nextInt();
   Integer obj=Integer.valueOf(i);
   int a=obj.intValue();
    System.out.println("Wrapper Object: "+obj);
   System.out.println("Primitive value: "+a);
    sc.close();
  }
}*/
/* 
void action(){
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    Integer obj=a;
    System.out.println("Primitive value: "+a);
    System.out.println("Wrapper Object: "+obj);
    sc.close();
  }
}*/
/*
import java.util.Scanner;

public class WrapperClass{
  public static void main(String[] args){
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int i=sc.nextInt();
    Integer obj=i;
    int a= obj;
  System.out.println("Wrapper Object:"+obj);
  System.out.println("Primitive value:"+a);
  sc.close();  
  }
}
   */
  /* 
  public class WrapperClass{
    public static void main(String[] args){
      int a=10;
      Integer obj=Integer.valueOf(a);
      System.out.println("Primitive:"+a);
      System.out.println("Wrapper:"+obj);
    }
  }*/
 public class WrapperClass{
  public static void main(String[] args){
  Integer obj=20;
  int a=obj.intValue();
  System.out.println("Wrapper Object:"+obj);
  System.out.println("Primitive value:"+a);
  }
 }
 