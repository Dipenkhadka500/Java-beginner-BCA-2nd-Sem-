public class Parent {

    public void displayName() {
        System.out.println("This is normal class");
    }

    public static void displayAge() {
        System.out.println("Age: 20");
    }
}

     class Child extends Parent {

    public static void main(String[] args) {
        Child c = new Child();

        c.displayName();
        displayAge();
    }
}