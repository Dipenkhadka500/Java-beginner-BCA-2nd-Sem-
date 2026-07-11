class Student {
    private String name;
    private String address;
    private int age;
    private int marks;

    void setName(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void setAge(int age, int marks) {
        this.age = age;
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    int getAge() {
        return age;
    }

    int getMarks() {
        return marks;
    }
}

public class Encaplusation {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Dipen", "Biratnagar");
        s.setAge(24, 156);

        System.out.println("Name: " + s.getName());
        System.out.println("Address: " + s.getAddress());
        System.out.println("Age: " + s.getAge());
        System.out.println("Marks: " + s.getMarks());
    }
}