package OYBEK.Math.Person;

public class Singer extends Person {
    String bandName;

    public Singer(String name, int age, String bandName) {
        super(name, age);
        this.bandName = bandName;
    }
    public void playGitar(){
        System.out.println("PlayGitar");
    }
    public void singing(){
        System.out.println("Singing");
    }
    public void print(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("BandName: " +bandName);
    }
}
