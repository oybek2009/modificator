package OYBEK.Math.Person;

public class Person implements PersonInt {

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void learn() {
        System.out.println("Learn");
    }

    @Override
    public void walk() {
        System.out.println("Walk");

    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }
    public void print(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}
