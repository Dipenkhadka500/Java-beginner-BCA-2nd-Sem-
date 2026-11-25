import java.util.ArrayList;
import java.util.List;

interface Subscriber{
  void update(String videotitle);
}
class User implements Subscriber{
  private String name;
  public User(String name){
    this.name=name;
  }
  public void update(String videotitle){
    System.out.println("Notification sent to " + name + ": " + videotitle);
  }
}
class YoutubeChannel{
  private List<Subscriber> s = new ArrayList<>();
  public void subscribe(Subscriber sub){
    s.add(sub);
  }
  public void unsubscribe(Subscriber sub){
    s.remove(sub);
  }
  public void uploadvideo(String title){
    System.out.println("Channel uploaded a new video: " + title);
    for(Subscriber sub : s){
      sub.update(title);
    }
  }
}
public class ObserverPattern {
  public static void main(String[] args) {
    YoutubeChannel channel = new YoutubeChannel();

    Subscriber user1 = new User("Alice");
    Subscriber user2 = new User("Bob");
    Subscriber user3 = new User("Charlie");

    channel.subscribe(user1);
    channel.subscribe(user2);
    channel.subscribe(user3);

    channel.uploadvideo("Java Programming Tutorial");
  }
}
