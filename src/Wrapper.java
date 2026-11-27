public class Wrapper {
  public static void main(String[] args){
    byte b= 24;
    byte a=20;
    Byte obj =Byte.valueOf(b);
    System.out.println("Byte:"+obj);
    System.out.println("Parse:"+ Byte.parseByte("20"));
    System.out.println("String:"+Byte.toString(obj));
    System.out.println("Compare:"+ Byte.compare(a,b));
    System.out.println("Comparison:"+ Byte.valueOf(a).compareTo(obj));
    Boolean bool=Double.isFinite(10.5);
    System.out.println("Boolean:"+ bool);


    char ch= 'a';
    char ab= Character.valueOf(ch);
    System.out.println("Character:"+ ab);
    System.out.println("Uppercase:"+ Character.toUpperCase(ab));
    System.out.println("Is Digit:"+Character.isDigit(ab));




    boolean z =true;
    boolean x =false;

    Boolean y =Boolean.valueOf(z);
    Boolean w =Boolean.valueOf(x);
    
    System.out.println("And Operation:"+Boolean.logicalAnd(y, w));
    System.out.println("XOR Operation:"+Boolean.logicalXor(y,w));
    System.out.println("Boolean Value:"+Boolean.getBoolean("ch"));


  }  
}
