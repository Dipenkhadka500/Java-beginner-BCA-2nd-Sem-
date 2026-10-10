class InvalidAgeException extends Exception{
  InvalidAgeException(String message){
    super(message);
  }
}

public class CustomException {
  static void CheckAge(int age) throws InvalidAgeException{
    
    if(age<18){
      throw new InvalidAgeException("Age must be 18 or above");
    }
    else{
      System.out.println("Age is valid");
    }
  }
  public static void main(String[] args){
    try{  
      CheckAge(16);

    }
    catch(InvalidAgeException e){
      System.out.println("Exception:"+e.getMessage());
    }
  }
}
