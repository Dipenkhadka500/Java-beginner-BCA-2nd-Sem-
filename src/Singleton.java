class Principal {
    private static Principal instance;

    private Principal() {
        // Private constructor to prevent instantiation
    }

    public static Principal getInstance() {
        if (instance == null) {
            instance = new Principal();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Tommorrow is a Holiday!");
    }
}
public class Singleton{
    public static void main(String[] args){
        Principal p1= Principal.getInstance();
        Principal p2= Principal.getInstance();
        p1.displayMessage();
        System.out.println("Are both instances the same? " + (p1 == p2));
    }
}