interface Notification{
  void notifyUser();
}
class EmailNotification implements Notification{
  @Override 
  public void notifyUser(){
    System.out.println("Sending an Email Notification");
  }
}
class SMSNotification implements Notification{
  @Override 
  public void notifyUser(){
    System.out.println("Sending an SMS Notification");
  }
}
abstract class NotificationFactory{
  public abstract Notification createNotification();
  }

class EmailFactory extends NotificationFactory{
public Notification createNotification(){
  return new EmailNotification();
}
}
class SMSFactory extends NotificationFactory{
  public Notification createNotification(){
    return new SMSNotification();
  }
}
public class Factory{
  public static void main(String[] args){
    NotificationFactory factory = new EmailFactory();
    Notification notification = factory.createNotification();
    notification.notifyUser();
  }
}
