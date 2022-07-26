package OYBEK.Math.Person;

public class Dancer extends Person {
    String groupName;

    public Dancer(String name, int age, String groupName) {
        super(name, age);
        this.groupName = groupName;
    }
    public void dancing(){
        System.out.println("Dancing");
    }
    public void print(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("GroupName: " +groupName);
    }
}
