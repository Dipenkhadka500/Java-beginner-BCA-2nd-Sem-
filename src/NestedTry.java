public class NestedTry {
  public static void main(String[] args){
    try{
      int a=10/2;
      System.out.println("Result:"+a);
      try{
        int arr[]={1,2,3};
        System.out.println(arr[2]);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index is out of bound");
      }
      try{
        String str=null;
        System.out.println(str.length());
      }
      catch(NullPointerException e){
        System.out.println("String is null");
      }
    }
    catch(ArithmeticException e){
      System.out.println("Number can not be divided by zero");
    }
    finally{
      System.out.println("This is finally block");
    }
  }
}
