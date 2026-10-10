public class MultipleTryCatch {
  public static void main(String[] args){
    try{
      int a=10;
      int b=2;
      int c=a/b;
      System.out.println("Result:"+c);
       
      int arr[]={1,2,3};
      System.out.println(arr[4]);
    }
    catch(ArithmeticException e){
      System.out.println("Number can not be divided by zero");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array index is out of bound");
    }
    finally{
      System.out.println("This is finally block");
    }
  }
}
