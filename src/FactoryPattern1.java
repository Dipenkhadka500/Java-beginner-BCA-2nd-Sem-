interface Payment{
  void pay();
}
class CashPayment implements Payment{
  @Override 
  public void pay(){
    System.out.println("Payment done using cash");
  }
}
class CardPayment implements Payment{
  @Override 
  public void pay(){
    System.out.println("payment done using card");
  }
}
abstract class PaymentFactory{
  public abstract Payment createPayment();
}
class CashFactory extends PaymentFactory{
  public Payment createPayment(){
    return new CashPayment();
  }
}
class CardFactory extends PaymentFactory{
  public Payment createPayment(){
    return new CardPayment();
  }
}
public class FactoryPattern1 {
  public static void main(String[] args){
    PaymentFactory factory = new CashFactory();
    Payment payment = factory.createPayment();
    payment.pay();
  }
}
