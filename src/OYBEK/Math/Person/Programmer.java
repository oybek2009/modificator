package OYBEK.Math.Person;

public class Programmer extends Person {
    String companyName;

    public Programmer(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println("Coding");
    }
    public void print(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("CompanyName: " +companyName);
    }
}
