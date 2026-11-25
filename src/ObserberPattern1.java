import java.util.ArrayList;
import java.util.List;

interface Viewer{
  void notify(String content);
}
class Subscriber implements Viewer{
  private String name;
  public Subscriber(String name){
    this.name=name;
  }
  public void notify(String content){
    System.out.println("New content arrived:" +content);
  }
}
class ContentProvider{
  private List<Viewer> viewers = new ArrayList<>();
  public void addViewer(Viewer video){
    viewers.add(video);
  }
  public void removeViewer(Viewer video){
    viewers.remove(video);
  }
  public void uploadContent(String content){
    System.out.println("ContentProvider uploaded new content: " + content);
    for(Viewer video : viewers){
      video.notify(content);
    }
  }
}
public class ObserberPattern1{
  public static void main(String[] args){
    ContentProvider provider = new ContentProvider();
    Viewer V1 = new Subscriber("Dipen");
    Viewer V2 = new Subscriber("Ramesh");
    provider.addViewer(V1);
    provider.addViewer(V2);
    provider.uploadContent("Checkout my new Content!");
  }
}